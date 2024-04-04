package time.test;

import java.util.Scanner;

public class CalenderMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        Calender.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("월을 입력하세요 : ");
        Calender.setMonth(scanner.nextInt());
        scanner.nextLine();

        Calender.setCalender();
        
    }
}
