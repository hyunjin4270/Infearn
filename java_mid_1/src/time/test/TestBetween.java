package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period betweenDate = Period.between(startDate, endDate);
        long dDay = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("���� ��¥: " + startDate);
        System.out.println("��ǥ ��¥: " + endDate);
        System.out.println(betweenDate.getYears() + "�� " + betweenDate.getMonths() + "���� " + betweenDate.getDays() + "��");
        System.out.println("���� " + dDay + "�� ����");

    }
    
}
