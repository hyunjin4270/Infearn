package lang.wrapper;

public class WrapperVsPrimitive {
    
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // �ݺ� Ƚ�� ����, 10��
        long startTime, endTime;

        //�⺻�� long ���
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
            
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("�⺻ �ڷ��� long ���� �ð�: " + (endTime - startTime) + "ms"); //592ms

        //���� Ŭ���� Long ���
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; //���� �ڽ� �߻�
            
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("���� Ŭ���� long ���� �ð�: " + (endTime - startTime) + "ms"); //5169ms
    }
    
}
