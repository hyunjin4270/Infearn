package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i); //objMethod: 10 type = Object

        // 타입 인자(Type Arugument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        GenericMethod.<Integer>genericMethod(i); //genericMethod: 10 type = Integer
        GenericMethod.<Integer>numberMethod(i); //numberMethod: 10 type = Integer
        GenericMethod.<Double>numberMethod(20.0); //numberMethod: 20.0 type = Double

        GenericMethod.genericMethod(i); //genericMethod: 10 type = Integer
        GenericMethod.numberMethod(i); //numberMethod: 10 type = Integer
        GenericMethod.numberMethod(20.0); //numberMethod: 20.0 type = Double

    }
}
