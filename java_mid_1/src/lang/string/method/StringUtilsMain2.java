package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format �޼���
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("����: %.2f", 10.1234);
        System.out.println(format2);

        // printf
        System.out.printf("����: %.2f\n", 10.1234);

        // matches �޼���
        //"Hello, Java!";
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'�� ���ϰ� ��ġ�ϴ°�?" + str.matches(regex));
    }
    
}