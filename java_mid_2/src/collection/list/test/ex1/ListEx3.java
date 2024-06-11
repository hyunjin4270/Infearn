package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        double average = 0;
        int total = 0;
        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        while (true) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            list.add(num);
        }

        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
            total += list.get(i);
        }
        average = (double) total / list.size();
        System.out.println("\n입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
