import './App.css'
import Editor from './components/Editor'
import List from './components/List'
import Header from './components/Header'
import { useRef, useReducer } from 'react'

const mockData = [
  { 
    id: 0,
    isDone: false,
    content: "React 공부하기",
    date: new Date().getTime()
  },
  { 
    id: 1,
    isDone: false,
    content: "빨래하기",
    date: new Date().getTime()
  },
  { 
    id: 2,
    isDone: false,
    content: "노래 연습하기",
    date: new Date().getTime()
  }
]

function reducer(todos, action) {
  switch(action.type) {
    case 'CREATE':
      return [action.todo, ...todos]
    case 'UPDATE':
      return todos.map((todo) => todo.id === action.id
        ? {...todo, isDone: !todo.isDone}
        : todo
      )
    case 'DELETE':
      return todos.filter((todo) => todo.id !== action.id)
    default:
      return todos
  }

}


function App() {
  
  const [todos, dispatch] = useReducer(reducer, mockData);
  const idRef = useRef(3);

  const onCreate = (content) => {
    dispatch({ type: 'CREATE', todo: {
      id: idRef.current++,
      isDone: false,
      content: content,
      date: new Date().getTime()
    },
  })
  }

  const onUpdate = (targetId) => {
    dispatch({ type: 'UPDATE', id: targetId })
  }

  const onDelete = (targetId) => {
    dispatch({ type: 'DELETE', id: targetId })
  }

  return (
    <div className='App'>
        <Header />
        <Editor onCreate={onCreate}/>
        <List todos={todos} onUpdate={onUpdate} onDelete={onDelete}/>
      </div>
    );
  }

export default App;
