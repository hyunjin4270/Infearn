package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf �޼���
        String numString = String.valueOf(num);
        System.out.println("������ ���ڿ� ��: " + numString);
        
        String boolString = String.valueOf(bool);
        System.out.println("�Ҹ����� ���ڿ� ��: " + boolString);
        
        String objString = String.valueOf(obj);
        System.out.println("��ü�� ���ڿ� ��: " + objString);

        //���� + x -> ����
        String numString2 = "" + num;
        System.out.println("���ڿ� + num: " + numString2);

        //toCharArray �޼���
        char[] strCharArray = str.toCharArray();
        System.out.println("���ڿ��� ���� �迭�� ��ȯ: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();



    }
    
}
