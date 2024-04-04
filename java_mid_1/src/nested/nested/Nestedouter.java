package nested.nested;

public class Nestedouter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            //�ڽ��� ����� ����
            System.out.println(nestedInstanceValue);

            //�ٱ� Ŭ������ �ν��Ͻ� ����� ���ٿ��� ������ �� ����
            //System.out.println(outInstanceValue);

            //�ٱ� Ŭ������ Ŭ���� ������� ������ �� �ִ�. private�� ���� ����
            System.out.println(outClassValue);
        }
        
    }

    
}
