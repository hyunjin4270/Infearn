import './App.css'
import { useState, useReducer, useRef, createContext, useEffect } from 'react'
import { Routes, Route } from 'react-router-dom'
import Home from './pages/Home'
import New from './pages/New'
import Diary from './pages/Diary'
import Edit from './pages/Edit'
import Notfound from './pages/Notfound'

function reducer(state, action) {
  let nextState;
  switch(action.type) {
    case 'INIT':
      {
        return action.data;
      }
    case 'CREATE':
      {
        nextState = [action.data, ...state];
      break;
      }
    case 'UPDATE':
      {
        nextState = state.map((item) => String(item.id) === String(action.data.id) ? action.data : item);
        break;
      }
    case 'DELETE':
      {
        nextState = state.filter((item) => String(item.id) !== String(action.data.id));
        break;
      }
    default:
      {
        nextState = 0;
        break;
      }

  }

  localStorage.setItem('diary', JSON.stringify(nextState));
  return nextState;
}

export const DiaryStateContext = createContext();
export const DiaryDispatchContext = createContext();

function App() {
  const [isLoading, setIsLoading] = useState(true);
  const [data, dispatch] = useReducer(reducer, []);
  const nextId = useRef(0);


  useEffect(() => {
    const storedData = localStorage.getItem('diary');
    if (!storedData) {
      setIsLoading(false);
      return;
    }

    const parsedData = JSON.parse(storedData);
    
    if(!Array.isArray(parsedData)) {
      setIsLoading(false);
      return;
    }

    let maxId = 0;
    parsedData.forEach((item) => {
      if (Number(item.id) > maxId) {
        maxId = Number(item.id);
      }
    })

    nextId.current = maxId + 1;
    dispatch({
      type : 'INIT',
      data : parsedData
    });
    setIsLoading(false);
  }, []);

  // 새로운 일기 추가
  const onCreate = (createdDate, emotionId, content) => {
    dispatch({
      type : 'CREATE',
      data : {
        id : nextId.current++,
        createdDate,
        emotionId,
        content
      }
    })
  }

  // 기존 일기 수정
  const onUpdate = (id, createdDate, emotionId, content) => {
    dispatch({
      type : 'UPDATE',
      data : {
        id,
        createdDate,
        emotionId,
        content
      }
    })
  }
  // 기존 일기 삭제
  const onDelete = (id) => {
    dispatch({
      type : 'DELETE',
      data : {
        id
      }
    })
  }

  if(isLoading) {
    return <div>로딩중...</div>
  }

  return ( 
    <>
      <DiaryStateContext.Provider value={data}>
        <DiaryDispatchContext.Provider value={{onCreate, onUpdate, onDelete}}>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/new" element={<New />} />
            <Route path="/diary/:id" element={<Diary />} />
            <Route path="*" element={<Notfound />} />
            <Route path="/edit/:id" element={<Edit />}/>
          </Routes>
        </DiaryDispatchContext.Provider>
      </DiaryStateContext.Provider>
    </>
  )
}

export default App;
