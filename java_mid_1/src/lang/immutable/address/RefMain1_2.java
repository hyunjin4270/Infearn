package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //������ ������ �ϳ��� �ν��Ͻ��� ������ �� �ִ�
        Address a = new Address("����");
        Address b = new Address("����");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("�λ�");
        System.out.println("�λ� -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
