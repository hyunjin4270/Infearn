package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate plusDate = localDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("³¯Â¥" + (i + 1) + ": " + plusDate);
            
        }
    }
    
}
