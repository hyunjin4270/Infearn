package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2{
    public static void hello(Process object) {
        System.out.println("���α׷� ����");


        //�ڵ� ���� ����
        object.run();
        //�ڵ� ���� ����

        System.out.println("���α׷� ����");
    }
    
    class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("�ֻ��� = " + randomValue);
        }
        
    }

    class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }

    }

    public static void main(String[] args) {
        class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("�ֻ��� = " + randomValue);
            }
            
        }
    
        class Sum implements Process {
    
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
    
        }
        hello(new Dice());
        hello(new Sum());
    }
}
