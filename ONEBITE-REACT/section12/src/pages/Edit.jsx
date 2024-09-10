import Header from "../components/Header";
import Button from "../components/Button";
import Editor from "../components/Editor";
import { useNavigate, useParams } from "react-router-dom";
import { useContext, useEffect, useState } from "react";
import { DiaryDispatchContext, DiaryStateContext } from "../App";
import usePageTitle from "../hooks/usePageTitle";

const New = () => {
    const navigate = useNavigate();
    const { onUpdate, onDelete } = useContext(DiaryDispatchContext);
    const data = useContext(DiaryStateContext);
    const params = useParams();
    const [currentDiaryItem, setCurrentDiaryItem] = useState();
    usePageTitle("일기 수정하기");

    useEffect(() => {
        const currentDiaryItem = data.find((item) => String(item.id) === String(params.id));

        if(!currentDiaryItem) {
            window.alert("존재하지 않는 일기입니다.");
            navigate('/', {replace: true});
        }

        setCurrentDiaryItem(currentDiaryItem);
    }, [params.id, data]);
;

    const onClickDelete= () => {
        const isDelete = window.confirm("일기를 정말 삭제할까요? 다시 복구되지 않아요!");
        if(isDelete) {
            onDelete(params.id);
            navigate('/', {replace: true});
        } else {
            return;
        }
    }

    const onSubmit = (input) => {
        
        onUpdate(params.id, input.createdDate.getTime(), input.emotionId, input.content);
        navigate('/', {replace: true});
    };

    return (
        <div>
            <div><Header title={"새 일기 쓰기"} 
            leftChild={<Button text={"< 뒤로 가기"} onClick={() => navigate(-1)}/>}
            rightChild={<Button text={"삭제하기"} type={"NEGATIVE"} onClick={onClickDelete}/>} /></div>
            <div><Editor initData={currentDiaryItem} onSubmit={onSubmit}/></div>
        </div>
    );
}

export default New;