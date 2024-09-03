// 1. Date 객체를 생성하는 방법
let date1 = new Date();
console.log(date1);

let date2 = new Date("1997/01/07");
console.log(date2);

// 2. 타임 스탬프
// 특정 시간이 "1970년 1월 1일 00:00:00"을 기준으로 몇 밀리초가 지났는지 나타내는 숫자
let ts1 = date1.getTime();
console.log(ts1);

let date4 = new Date(ts1);
console.log(date4);

// 3. 시간요소들을 추출하는 방법
let year = date1.getFullYear();
let month = date1.getMonth();
let date = date1.getDate();

let hours = date1.getHours();
let minutes = date1.getMinutes();
let seconds = date1.getSeconds();

console.log(`${year}-${month}-${date} ${hours}:${minutes}:${seconds}`);

// 4. 시간수정하기
date1.setFullYear(2022);
date1.setMonth(11);
date1.setDate(25);
date1.setHours(0);
date1.setMinutes(0);
date1.setSeconds(0);

console.log(date1);

// 5. 시간을 여러 포맷으로 출력하기
console.log(date1.toDateString());
console.log(date1.toLocaleString());