package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
          
        // �������� �ʴ� ���
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP ����� ���� �ݾ�: " + vip);

        // ��Ÿ
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD ����� ���� �ݾ�: " + diamondd);

        // �ҹ��� �Է�
        int gold = discountService.discount("gold", price);
        System.out.println("gold ����� ���� �ݾ�: " + gold);


    }
 
    
}
