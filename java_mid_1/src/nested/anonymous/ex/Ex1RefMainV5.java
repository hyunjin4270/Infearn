package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5{
    public static void hello(Process object) {
        System.out.println("���α׷� ����");


        //�ڵ� ���� ����
        object.run();
        //�ڵ� ���� ����

        System.out.println("���α׷� ����");
    }
    
    public static void main(String[] args) {
        
    
        
        hello(() -> {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("�ֻ��� = " + randomValue);
        });
    
        
        hello(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }
    }


