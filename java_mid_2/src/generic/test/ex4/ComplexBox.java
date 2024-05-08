package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
