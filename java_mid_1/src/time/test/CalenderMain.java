package time.test;

import java.util.Scanner;

public class CalenderMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�⵵�� �Է��ϼ��� : ");
        Calender.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("���� �Է��ϼ��� : ");
        Calender.setMonth(scanner.nextInt());
        scanner.nextLine();

        Calender.setCalender();
        
    }
}
