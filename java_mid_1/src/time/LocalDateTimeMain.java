package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("���� ��¥�ð� = " + nowDt);
        System.out.println("���� ��¥�ð� = " + ofDt);

        //��¥�� �ð� �и�
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //��¥�� �ð� ��ü
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //���(�Һ�)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("���� ��¥�ð�+1000d = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("���� ��¥�ð�+1�� = " + ofDtPlus1Year);

        //��
        System.out.println("���� ��¥�ð��� ���� ��¥�ð����� �����ΰ�? " + nowDt.isBefore(ofDt));
        System.out.println("���� ��¥�ð��� ���� ��¥�ð����� �����ΰ�? " + nowDt.isAfter(ofDt));
        System.out.println("���� ��¥�ð��� ������¥�ð��� ������? " + nowDt.isEqual(ofDt));
    }
    
}
