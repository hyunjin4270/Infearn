package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("�ε��� 7������ �κ� ���ڿ�: " + str.substring(7));
        System.out.println("�ε��� 7���� 12������ �κ� ���ڿ�: " + str.substring(7, 12));

        System.out.println("���ڿ� ����: " + str.concat("! ! !"));

        System.out.println("'Java'�� 'World'�� ��ü: " + str.replace("Java", "World"));
        System.out.println("ù ��° 'Java'�� 'World'�� ��ü: " + str.replaceFirst("Java", "World"));
    }
    
}
