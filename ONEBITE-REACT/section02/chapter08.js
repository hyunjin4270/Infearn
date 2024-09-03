// 5가지 요소 순회 및 탐색 메서드
// 1. forEach
// 모든 요소 순회하면서, 각각의 요소에 특정 동작을 수행시키는 메서드
let arr1 = [1, 2, 3];

arr1.forEach((item, idx, arr) => {
    console.log(`${idx}번째 요소: ${item}`);
    console.log(arr);
});

let dobuleArr = [];

arr1.forEach(item => {
    dobuleArr.push(item * 2);
})

console.log(dobuleArr);

// 2. includes
// 배열에 특정 요소가 있는지 확인하는 메서드
let arr2 = [1, 2, 3];
let isInclude = arr2.includes(10); //반환 타입은 boolean


// 3. indexOf
// 특정 요소의 인덱스를 찾아서 반환하는 메서드
let arr3 = [2, 2, 2];
let index = arr3.indexOf(20); 

// 4. findIndex
// 모든 요소를 순회하면서, 콜백함수를 만족하는 첫 번째 요소의 인덱스를 반환
// 특정 요소의 인덱스를 반환하는 메서드
let arr4 = [1, 2, 3];
const findedIndex = arr4.findIndex(item => item % 2 !== 0); 
console.log(findedIndex);

// 5. find
// 모든요소를 순회하면서 콜백함수를 만족하는 요소를 찾는데, 요소를 그대로 반환
let arr5 = [
    { id: 1, name: "John" },
    { id: 2, name: "Steve" }
];

const finded = arr5.find(item => item.name === "John");

console.log(finded);

