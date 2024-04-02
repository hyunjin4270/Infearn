package time;

import java.time.*;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        //��꿡 ���
        LocalTime plusTime = lt.plus(duration);
        System.out.println("���� �ð�: " + plusTime);

        //�ð� ����
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("����: " + between.getSeconds() + "��");

    }
    
}
