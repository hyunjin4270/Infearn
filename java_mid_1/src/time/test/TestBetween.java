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
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println(betweenDate.getYears() + "년 " + betweenDate.getMonths() + "개월 " + betweenDate.getDays() + "일");
        System.out.println("디데이 " + dDay + "일 남음");

    }
    
}
