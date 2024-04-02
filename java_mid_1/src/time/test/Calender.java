package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Calender {

    private Calender() {}
    private int year;
    private int month;

    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    void setCalender(int year, int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (long i = 0; i < localDate2.getDayOfMonth(); i++) {
            LocalDate plusDay = localDate.plusDays(i);
            DayOfWeek calender = plusDay.getDayOfWeek();
            String string = calender.toString();

            if (string.equals("localDate2")) {
                
            }
            
        }
    }
    
}
