package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("����");
        ImmutableAddress b = a; //������ ������ ���� �� �ִ� ����� ����
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("�λ�"); //b�� ���� �λ����� �����ؾ���
        b = new ImmutableAddress("�λ�");
        System.out.println("�λ� -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
