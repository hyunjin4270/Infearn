package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("����");

        MemberV1 memberA = new MemberV1("ȸ��A", address);
        MemberV1 memberB = new MemberV1("ȸ��B", address);

        //ȸ��A, ȸ��B�� ó�� �ּҴ� ��� ����
        System.out.println("memberA=" + memberA);
        System.out.println("memberB=" + memberB);

        //ȸ��B�� �ּҸ� �λ����� �����ؾ���
        memberB.getAddress().setValue("�λ�");
        System.out.println("�λ� -> memberB.address");
        System.out.println("memberA=" + memberA);
        System.out.println("memberB=" + memberB);
    }
    
}
