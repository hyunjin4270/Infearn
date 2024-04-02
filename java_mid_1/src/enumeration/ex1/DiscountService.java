package enumeration.ex1;

public class DiscountService {

    int discount(String grade, int price) {
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": ÇÒÀÎX");
        }


        //10000 *(20 / 100) -> 2000¿ø
        return price * discountPercent / 100;
    }
    
}
