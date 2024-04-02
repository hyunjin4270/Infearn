package enumeration.ex;

import java.util.Scanner;
import static enumeration.ex.AuthGrade.*;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("����� ����� �Է��ϼ���[GUEST, LOGIN, ADMIN]:");
        String answer = scanner.nextLine();
        printMenu(answer);

    }
    
    private static void printInformation(AuthGrade[] grade) {
        for (AuthGrade authGrade : grade) {
            System.out.println("grade=" + authGrade.name() + 
            ", level=" + authGrade.getLevel() + 
            ", ����=" + authGrade.getDescription());
        }
    }
}
