package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("���ڿ��� ����: " + str.length());
        System.out.println("���ڿ��� ��� �ִ���: " + str.isEmpty());
        System.out.println("���ڿ��� ��� �ְų� ��������: " + str.isBlank());
        System.out.println("���ڿ��� ��� �ְų� ��������: " + "        ".isBlank());

        char c = str.charAt(7);
        System.out.println("7�� �ε����� ���� = " + c);
    }
    
}
