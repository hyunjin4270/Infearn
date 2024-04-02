package time;

import java.time.*;
public class PeriodMain {
    
    public static void main(String[] args) {
        //����
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //��꿡 ���
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        //�Ⱓ ����
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("�Ⱓ: " + between.getMonths() + "���� " + between.getDays() + "��");
    }
}
