package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4{
    public static void hello(Process object) {
        System.out.println("���α׷� ����");


        //�ڵ� ���� ����
        object.run();
        //�ڵ� ���� ����

        System.out.println("���α׷� ����");
    }

    public static void main(String[] args) {
        
    
        
        hello(new Process() {
    
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("�ֻ��� = " + randomValue);
            }
            
        });
    
        
        hello(new Process() {
    
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
    
        });
    }
    }

