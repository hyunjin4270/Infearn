import "./Editor.css";
import { useState, useRef, useContext } from 'react';
import { TodoDispatchContext } from '../App';

const Editor = () => {
    const {onCreate} = useContext(TodoDispatchContext);
    const [content, setContent] = useState("");
    const contentRef = useRef();

    const onChangeContent = (e) => {
        setContent(e.target.value);
    }

    const onKeyDown = (e) => {
        if (e.key === "Enter") {
            onSubmit();
        }
    }   

    const onSubmit = () => {
        if (content === "") {
            contentRef.current.focus();
            return;
        }
        onCreate(content);
        setContent("");
    }
    
    return (
        <div className='Editor'>
            <input 
                ref={contentRef}
                placeholder="새로운 todo..." 
                value={content}
                onKeyDown={onKeyDown}
                onChange={onChangeContent}
            />
            <button onClick={onSubmit}>추가</button>
        </div>
    );
}

export default Editor;