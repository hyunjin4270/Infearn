package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        System.out.println("���α׷� ����");


        //�ڵ� ���� ����
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("�ֻ��� = " + randomValue);
        //�ڵ� ���� ����


        System.out.println("���α׷� ����");
    }

    public static void helloSum() {
        System.out.println("���α׷� ����");

        //�ڵ� ���� ����
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        //�ڵ� ���� ����


        System.out.println("���α׷� ����");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
    
}
