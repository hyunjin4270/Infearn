package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC ����� ���� �ݾ�: " + basic);
        System.out.println("GOLD ����� ���� �ݾ�: " + gold);
        System.out.println("DIAMOND ����� ���� �ݾ�: " + diamond);
    }

    
}