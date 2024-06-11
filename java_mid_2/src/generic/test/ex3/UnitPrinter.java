package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> box) {
        T unit = box.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> box) {
        BioUnit unit = box.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
