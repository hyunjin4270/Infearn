package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //����, ���� ��ü ��ȯ
        Integer i2 = Integer.valueOf("10"); //���ڿ�, ���� ��ü ��ȯ
        int intValue = Integer.parseInt("10"); //���ڿ� ����, �⺻�� ��ȯ

        //��
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //��� ����
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
    
}