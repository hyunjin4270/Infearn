//중복 선언 가능
// greeting = 'how are you';
// console.log(greeting);

//중복 선언 불가 재할당 가능
// let greeting = 'hello';
// console.log(greeting);

//중복 선언 불가 재할당 불가
// const greeting = 'helloc';
// console.log(greeting);

// function func() {
//     if(true) {
//         var a = 'a';
//         console.log(a);
//     }
// }

// func();

func();

function func() {
    console.log("hello");
}

// 원시 타입
// 문자열 String
const name = "han";
// Integer
const age = 15;
// Boolean
const hasJob = true;
// Symbol
const sym = Symbol();

console.log(typeof sym);