package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        //��� ���Ŀ��� �������� �ű԰� ��� Ȯ�� ����
        System.out.println("obj = " + obj1.getValue());
    }
    
}
