package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //¿ÀÅä ¹Ú½Ì(Auto boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //¿ÀÅä ¾ð¹Ú½Ì (Auto Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
    
}
