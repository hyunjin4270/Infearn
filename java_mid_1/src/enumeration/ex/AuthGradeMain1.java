package enumeration.ex;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        printInformation(authGrades);
    }

    private static void printInformation(AuthGrade[] grade) {
        for (AuthGrade authGrade : grade) {
            System.out.println("grade=" + authGrade.name() + 
            ", level=" + authGrade.getLevel() + 
            ", Ό³Έν=" + authGrade.getDescription());
        }
    }
    
}
