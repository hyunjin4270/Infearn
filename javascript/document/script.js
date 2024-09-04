let val;

val = document;

val = document.baseURI; //웹 페이지의 절대 URI 반환
val = document.head; //head 태그 반환
val = document.body; // body 태그 반환

val = document.forms; // form 태그 반환
val = document.forms[0].id;
val = document.forms[0].classList;
val = document.forms[0].className;

const headerContainer = document.getElementById('header-container');
console.log(headerContainer);

const items = document.getElementsByClassName('list-group-item');
items[0].style.color = 'blue';
items[3].textContent = 'Hello';

let lists = document.getElementsByTagName('li');

console.log(lists);

lists = Array.from(lists);

console.log(lists);