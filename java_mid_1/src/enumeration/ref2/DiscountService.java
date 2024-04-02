package enumeration.ref2;


public class DiscountService {

    int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }

    
}
