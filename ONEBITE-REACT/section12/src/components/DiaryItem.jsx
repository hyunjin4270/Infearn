import { getEmotionImage } from "../util/get-emotion-image";
import Button from "./Button";
import "./DiaryItem.css";
import { useNavigate } from "react-router-dom";

const DiaryItem = ({id, emotionId, createdDate, content}) => {
    const navigate = useNavigate();
    return (
        <div className="DiaryItem">
            <div className={`img_section img_section_${emotionId}`} onClick={() => navigate(`diary/${id}`)}>
                <img src={getEmotionImage(emotionId)} />
            </div>
            <div className="info_section" onClick={() => navigate(`diary/${id}`)}>
                <div className="created_date">
                    {new Date(createdDate).toLocaleDateString()}
                </div>
                <div className="content">
                    {content}
                </div>
            </div>

            <div className="button_section" onClick={() => navigate(`edit/${id}`)}>
                <Button text={"수정하기"} type={"DEFAULT"} />
            </div>
        </div>
        
    )
}

export default DiaryItem;