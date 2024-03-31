package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        @SuppressWarnings("removal")
        Integer newInteger = new Integer(10);// �̷��� ���� ����, ��ſ� valueOf()�� ���
        Integer integerObj = Integer.valueOf(10);// -128 ~ 127 ���� ����ϴ� ���� �� ����, �Һ�
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj" + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("���� �� �б�");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("��");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));

    }
    
}
