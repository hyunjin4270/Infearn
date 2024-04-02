package enumeration.ex;

public enum AuthGrade {
    GUEST(1, "�մ�"), 
    LOGIN(2, "�α��� ȸ��"),
    ADMIN(3, "������");

    private final int level;
    private final String description;
    
    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }
    public int getLevel() {
        return level;
    }
    public String getDescription() {
        return description;
    }

    public static void printMenu(String string) {
        AuthGrade authGrade = AuthGrade.valueOf(string);
        System.out.println("����� ����� " + authGrade.getDescription() + 
        "�Դϴ�.");
        System.out.println("==�޴� ���==");
        switch (authGrade.getLevel()) {
            case 1 -> {System.out.println("- ���� ȭ��");}
            case 2 -> {
                System.out.println("- ���� ȭ��");
                System.out.println("- �̸��� ���� ȭ��");
            }
            case 3 -> {
                System.out.println("- ���� ȭ��");
                System.out.println("- �̸��� ���� ȭ��");
                System.out.println("- ������ ȭ��");
            }
            default -> {
                System.exit(1);
            }

        }
    }

}
