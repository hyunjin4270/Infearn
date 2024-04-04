package nested.nested;

public class NestedOuterMain {
    
    public static void main(String[] args) {
        Nestedouter.Nested nested = new Nestedouter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
        
    }

    
}
