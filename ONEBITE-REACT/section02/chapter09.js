// 5가지 배열 변형 메서드
// 1. filter
// 기존 배열에서 조건을 만족하는 요소들만 필터링하여 새로운 배열로 반환

let arr1 = [
    { id: 1, name: "John" },
    { id: 2, name: "Steve" },
    { id: 3, name: "John" }
];

const tennisPeople = arr1.filter(item => item.name === "Steve");

// 2. map
// 배열의 모든 요소를 순회하면서, 각각 콜백함수를 실행하고 그 결과값들을 모아서 새로운 배열로 반환
let arr2 = [1, 2, 3];
const mapResult1 = arr2.map((item, idx, arr) => {
    return item * 2;
});

// 3. sort
// 배열을 사전순으로 정렬하는 메서드
let arr3 = [3, 1, 2];
arr3.sort((a, b) => {
    if (a > b) return 1;
    if (a === b) return 0;
    if (a < b) return -1;
});

console.log(arr3);

// 4. toSorted
// 배열을 정렬한 새로운 배열을 반환하는 메서드
let arr5 = [3, 1, 2];
const sortedArr = arr5.toSorted((a, b) => a - b);

console.log(sortedArr);

// 5. join
// 배열의 모든 요소를 하나의 문자열로 합쳐서 반환하는 메서드
let arr6 = ["hi", "im", "john"];
const joinedStr = arr6.join(" ");

console.log(joinedStr);``
