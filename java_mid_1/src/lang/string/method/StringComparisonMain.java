package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //�빮�� �Ϻ� ����
        String str2 = "hello, java!"; //�빮�� ���� ��� �ҹ���
        String str3 = "Hello, World!"; //�ٸ� ����

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str3: " + str1.compareToIgnoreCase(str3));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java': " + str1.endsWith("Java!"));
    }
    
}
