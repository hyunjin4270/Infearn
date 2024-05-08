package generic.test.ex4;

public class GenericMethod {
    static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    static <T> T genericMethod(T obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }
    static <T extends Number> T numberMethod(T obj) {
        System.out.println("bound print: " + obj);
        return obj;
    }
}
