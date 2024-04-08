package exception.ex4;

import exception.ex4.exception.SendExceptionV4;
import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("������ ����: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // ��� ���ܸ� ��Ƽ� ó��
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("���α׷��� ���� �����մϴ�.");
    }

    // ���� ���� ó��
    private static void exceptionHandler(Exception e) {
        // ���� ó��
        System.out.println("����� �޽���: �˼��մϴ�. �� �� ���� ������ �߻��߽��ϴ�.");
        System.out.println("==�����ڿ� ����� �޽���==");
        e.printStackTrace(System.out); // ���� Ʈ���̽� ���
        // e.printStackTrace(); // System.err�� ���� Ʈ���̽� ���
        // �ʿ��ϸ� ���� ���� ������ �߰� ó�� ����
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[���� ����] ���� ������: " + sendEx.getSendData());
        }
    }
}