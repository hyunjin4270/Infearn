package lang.string.ex;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            
        }

        String join = String.join("->", split);
        System.out.println(join);
    }
    
}
