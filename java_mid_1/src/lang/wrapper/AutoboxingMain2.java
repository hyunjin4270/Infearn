package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //���� �ڽ�(Auto boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //���� ��ڽ� (Auto Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
    
}
