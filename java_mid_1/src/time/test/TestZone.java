package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newyorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("������ ȸ�� �ð�: " + seoulTime);
        System.out.println("������ ȸ�� �ð�: " + londonTime);
        System.out.println("������ ȸ�� �ð�: " + newyorkTime);
    }
    
}
