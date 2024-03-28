package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("����");
        MemberV2 memberA = new MemberV2("ȸ��A", address);
        MemberV2 memberB = new MemberV2("ȸ��B", address);

        //ȸ��A, ȸ��B�� ó�� �ּҴ� ��� ����
        System.out.println("memberA=" + memberA);
        System.out.println("memberB=" + memberB);

         //ȸ��B�� �ּҸ� �λ����� �����ؾ���
         memberB.setAdress(new ImmutableAddress("�λ�"));
         System.out.println("�λ� -> memberB.address");
         System.out.println("memberA=" + memberA);
         System.out.println("memberB=" + memberB);
    }
    
}
