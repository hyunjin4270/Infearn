package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming";

        System.out.println("�ҹ��ڷ� ��ȯ: " + strWithSpaces.toLowerCase());
        System.out.println("�빮�ڷ� ��ȯ: " + strWithSpaces.toUpperCase());

        System.out.println("���� ����(trim): " + strWithSpaces.trim());
        System.out.println("���� ����(strip): " + strWithSpaces.strip());
        System.out.println("�� ���� ����(strip): " + strWithSpaces.stripLeading());
        System.out.println("�� ���� ����(strip): " + strWithSpaces.stripTrailing());
    }
    
}
