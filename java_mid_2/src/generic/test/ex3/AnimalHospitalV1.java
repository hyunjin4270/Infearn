package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Dog;

public class AnimalHospitalV1 {
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
    }

    public Animal bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
