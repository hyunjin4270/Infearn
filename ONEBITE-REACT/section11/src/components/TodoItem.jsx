import "./TodoItem.css";
import { memo, useContext } from "react";
import { TodoDispatchContext } from "../App";


const TodoItem = ({id, isDone, content, date}) => {
    const {onUpdate, onDelete} = useContext(TodoDispatchContext);

    const onChangeCheckbox = () => {
        onUpdate(id);
    }

    const onClickDelete = () => {
        onDelete(id);
    }

    return (
        <div className="TodoItem">
            <input 
            type="checkbox" 
            checked={isDone} 
            onChange={onChangeCheckbox}
            ></input>
            <div className="content">{content}</div>
            <div className="date">{new Date(date).toLocaleDateString()}</div>
            <button onClick={onClickDelete}>삭제</button>
        </div>
    )
}

// 고차 컴퍼넌트 (HOC)
/* export default memo(TodoItem, (prevProps, nextProps) => {
    // 반환값에 따라, Prop가 바뀌었는지 안바뀌었는지 판단
    // T -> 바뀌지 않음
    // F -> 바뀜
    if(prevProps.id !== nextProps.id) {
        return false;
    } else if(prevProps.isDone !== nextProps.isDone) {
        return false;
    } else if(prevProps.content !== nextProps.content) {
        return false;
    } else if(prevProps.date !== nextProps.date) {
        return false;
    } else {
        return true;
    }
}); */

export default memo(TodoItem);