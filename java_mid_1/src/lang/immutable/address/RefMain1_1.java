package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //������ ������ �ϳ��� �ν��Ͻ��� ������ �� �ִ�
        Address a = new Address("����");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("�λ�");
        System.out.println("�λ� -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
