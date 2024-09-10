import Button from "../components/Button";
import DiaryItem from "../components/DiaryItem";
import "./DiaryList.css";
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import usePageTitle from "../hooks/usePageTitle";


const DiaryList = ({data}) => {
    const [sortType, setSortType] = useState("latest");
    const navigate = useNavigate();

    usePageTitle("감정 일기장");

    const onChangeSortType = (e) => {
        setSortType(e.target.value);
    }

    const getsortedData = () => {
        return data.toSorted((a, b) => {
            if (sortType === "latest") {
                return a.createdDate > b.createdDate ? -1 : 1;
            } else {
                return a.createdDate < b.createdDate ? -1 : 1;
            }
        });
    }

    const sortedData = getsortedData();

    return (
        <div className="DiaryList">
            <div className="menu_bar">
                <select onChange={onChangeSortType}>
                    <option value={"latest"}>최신순</option>
                    <option value={"oldest"}>오래된순</option>
                </select>
                <Button text={"새 일기 쓰기"} type={"POSITIVE"} onClick={() => navigate('new/')} />
            </div>
            <div className="list_wrapper">
                {sortedData.map((item) => 
                    <DiaryItem key={item.id} {...item}/>
                )}
            </div>
        </div>
    )
}

export default DiaryList;