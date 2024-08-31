// 1. if 조건문 (if문)
let num = 10;

/* if (num >= 10) {
    console.log("num은 10 이상입니다");
    console.log("조건이 참 입니다!");
} else {
    console.log("num은 10 미만입니다");
    console.log("조건이 거짓 입니다!");
}  */

// 2. Switch 문
// -> if문과 기능 자체는 동일
// -> 다중 조건을 처리할 때 사용

let animal = "cat";

switch (animal) {
    case "dog":
        console.log("강아지");
        break;
    case "cat":
        console.log("고양이");
        break;
    case "bird":
        console.log("새");
        break;
    default:
        console.log("잘 모르겠어요");
        break;
}