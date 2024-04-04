package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            //�ڱ� �ڽſ� ����
            System.out.println(innerInstanceValue);

            // �ܺ� Ŭ������ �ν��Ͻ� ����� ���� ����, private ���� ����
            System.out.println(outInstanceValue);

            // �ܺ� Ŭ������ Ŭ���� ����� ���� ����. private ���� ����
            System.out.println(outClassValue);
        }
    }
    
}
