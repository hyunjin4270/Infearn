function returnFalse() {
    console.log("False 함수");
    return false;
}

function returnTrue() {
    console.log("True 함수");
    return true;
}
const name = null || "이름";
console.log(name);
console.log(returnFalse() && returnTrue());
if (false || true) {
    console.log("참");
}