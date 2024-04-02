package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 4, 0);
        System.out.println("���� �ð�: " + localDateTime);

        //�ð� �߰�
        LocalDateTime plusDateTime = localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1�� 2���� 3�� 4�ð� ���� �ð�: " + plusDateTime);
    }
    
}
