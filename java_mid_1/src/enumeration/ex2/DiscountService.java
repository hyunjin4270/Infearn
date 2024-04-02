package enumeration.ex2;

public class DiscountService {

    int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if(classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("ÇÒÀÎX");
        }


        //10000 *(20 / 100) -> 2000¿ø
        return price * discountPercent / 100;
    }
    
}
