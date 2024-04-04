package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Calender {

    private Calender() {}
    private static int year;
    private static int month;

    public static void setMonth(int month1) {
        month = month1;
    }
    public static int getMonth() {
        return month;
    }
    public static void setYear(int year1) {
        year = year1;
    }
    public static int getYear() {
        return year;
    }

    static void setCalender() {
        LocalDate localDate = LocalDate.of(year, month, 1);
        LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Su Mo Tu We Th Fr Sa");

        
        DayOfWeek startCalender = localDate.getDayOfWeek();
        String string = startCalender.toString();

        if (string.equals("SUNDAY")) {
            System.out.print(" ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("MONDAY")) {
            System.out.print("    ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("TUESDAY")) {
            System.out.print("       ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("WENDESDAY")) {
            System.out.print("          ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("THURSDAY")) {
            System.out.print("             ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("FRIDAY")) {
            System.out.print("                ");
            System.out.print(localDate.getDayOfMonth());
        } else if (string.equals("SATURDAY")) {
            System.out.print("                   ");
            System.out.print(localDate.getDayOfMonth());
            System.out.println();
        }
        
            for (long i = 1; i < localDate2.getDayOfMonth(); i++) {
                LocalDate plusDay = localDate.plusDays(i);
                DayOfWeek nextCalender = plusDay.getDayOfWeek();
                String string2 = nextCalender.toString();
                if (string2.equals("SUNDAY") && plusDay.getDayOfMonth() > 9) {
                    System.out.print(plusDay.getDayOfMonth());
                } else if (string2.equals("SUNDAY") || plusDay.getDayOfMonth() > 9){
                    System.out.print(" ");
                    System.out.print(plusDay.getDayOfMonth());
                } else {
                    System.out.print("  ");
                    System.out.print(plusDay.getDayOfMonth());
                }
    
                if (string2.equals("SATURDAY")) {
                    System.out.println();
                    
                }
            }
        }
    }
    

