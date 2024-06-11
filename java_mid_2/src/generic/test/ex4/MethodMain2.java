package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("멍멍이2", 200);
        Dog biggerDog = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("더 큰 개: " + biggerDog.getName());
    }
}
