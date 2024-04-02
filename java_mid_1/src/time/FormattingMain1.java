package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // ������: ��¥�� ���ڷ�
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
        String formattedDate = date.format(formatter);
        System.out.println("��¥�� �ð� ������ = " + formattedDate);

        // �Ľ�: ���ڸ� ��¥��
        String input = "2030�� 01�� 01��";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("���ڿ� �Ľ� ��¥�� �ð�: " + parsedDate);
    }
    
}
