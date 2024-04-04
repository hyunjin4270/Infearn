package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process object) {
        System.out.println("���α׷� ����");


        //�ڵ� ���� ����
        object.run();
        //�ڵ� ���� ����

        System.out.println("���α׷� ����");
    }
    
    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("�ֻ��� = " + randomValue);
        }
        
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }

    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}
