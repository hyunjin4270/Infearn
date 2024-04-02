package enumeration.ex;

import java.util.Scanner;
import static enumeration.ex.AuthGrade.*;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        String answer = scanner.nextLine();
        printMenu(answer);

    }
    
    private static void printInformation(AuthGrade[] grade) {
        for (AuthGrade authGrade : grade) {
            System.out.println("grade=" + authGrade.name() + 
            ", level=" + authGrade.getLevel() + 
            ", 설명=" + authGrade.getDescription());
        }
    }
}
