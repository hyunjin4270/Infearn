import Button from "../components/Button";
import Header from "../components/Header";
import { useContext } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { DiaryStateContext } from "../App";
import Viewer from "../components/Viewer";

const Diary = () => {
    const data = useContext(DiaryStateContext);
    const params = useParams();
    const navigate = useNavigate();

    const currentDiaryItem = data.find((item) => String(item.id) === String(params.id));

    const getMonthlyData = () => {
        let year = new Date(currentDiaryItem.createdDate).getFullYear();
        let month = new Date(currentDiaryItem.createdDate).getMonth() + 1;
        let day = new Date(currentDiaryItem.createdDate).getDate();

        if(month < 10) {
            month = `0${month}`;
        }

        if(day < 10) {
            day = `0${day}`;
        }

        return `${year}-${month}-${day}`;
    }
    console.log(currentDiaryItem);
    return (
        <div>
            <div><Header title={`${getMonthlyData()} 기록`}
                leftChild={<Button text={'< 뒤로 가기'} onClick={() => navigate("/")}/>}
                rightChild={<Button text={'수정하기'} onClick={() => navigate(`/edit/${params.id}`)} />}/>
            </div>
            <div><Viewer {...currentDiaryItem} /></div>
        </div>
    )
}

export default Diary;