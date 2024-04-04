package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    
    private int outInstanceVar = 3;
    
    public Printer process(int paramVar) {
        int localVar = 1; //���� ������ ���� �������� ����Ǵ� ���� �Բ� ���ŵȴ�.

        class LocalPrinter implements Printer {
            
            int value = 1; 

            @Override
            public void print() {
                System.out.println("value = " + value);

                //�ν��Ͻ��� ���� �������� �� ���� ��Ƴ��´�.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVer = " + paramVar);
                System.out.println("ouInstanceVar = " + outInstanceVar);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        //printer.print()�� ���⼭ �������� �ʰ� Printer �ν��Ͻ��� ��ȯ�Ѵ�.
        return printer;
    }

    public static void main(String[] args) {
        
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();

        //�߰�
        System.out.println("�ʵ� Ȯ��");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
