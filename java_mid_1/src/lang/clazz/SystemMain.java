package lang.clazz;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //���� �ð�(�и���)�� �����´�
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // ���� �ð�(������)�� �����´�
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // ȯ�� ������ �д´�.
        System.out.println("getenv = " + System.getenv());

        // �ý��� �Ӽ��� �д´�
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // �迭�� ������� �����Ѵ�
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // �迭 ���
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //���α׷� ����
        System.exit(0); //0 = ��������, !0 = ������ �������� ����
        
    }

    
}
