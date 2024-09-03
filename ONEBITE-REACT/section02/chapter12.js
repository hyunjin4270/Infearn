/* function add(a, b, callback) {
    setTimeout(() => {;
        const sum = a + b;
        callback(sum);
    }, 3000);
}

add(1, 2, (value) => {
    console.log(value);
}); */

function orderFood(callback) {
    setTimeout(() =>{
        const food = "치킨";
        callback(food);
    }, 3000);
}

function cooldownFood(food, callback) {
    setTimeout(() => {
        const cooldownedFood = `${food} 식혔습니다.`;
        callback(cooldownedFood);
    }, 2000);
}

function freezeFood(food, callback) {
    setTimeout(() => {
        const freezedFood = `${food} 얼렸습니다.`;  ;
        callback(freezedFood);
    }, 1500);
}

orderFood((food) => {
    console.log(food);

    cooldownFood(food, (cooldownedFood) => {
        console.log(cooldownedFood);

        freezeFood(cooldownedFood, (freezedFood) => {
            console.log(freezedFood);
        });
    })
})