package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("�������� 'Java'�� ���ԵǾ� �ִ���: " + str.contains("Java"));
        System.out.println("'Java'�� ù ��° �ε���: " + str.indexOf("Java"));
        System.out.println("�ε��� 10���� 'Java'�� �ε���: " + str.indexOf("Java", 10));
        System.out.println("'Java'�� ������ �ε���: " + str.lastIndexOf("Java"));
    }
    
}
