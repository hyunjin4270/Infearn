package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2004, 11, 4);
        System.out.println("���� ��¥ = " + nowDate);
        System.out.println("���� ��¥ = " + ofDate);

        //���(����
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("������¥+10d = " + plusDays);
    }
    
}
