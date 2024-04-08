package exception.basic.checked;

public class Service {
    Client client = new Client();

    /*
     * ���ܸ� ��Ƽ� ó���ϴ� �ڵ�
     */
    void callCatch() {

        try {
            client.call();
        } catch (MyCheckedException e) {
            //���� ó�� ����
            System.out.println("���� ó��, message = " + e.getMessage());
        }
        System.out.println("���� �帧");
        
    }
    /*
     * üũ ���ܸ� ������ ������ �ڵ�
     * üũ ���ܸ� ���� �ʰ� ������ �������� throws ���ܸ� �޼��忡 �ʼ��� �����ؾ� �Ѵ�
     */
    void catchThrow() throws MyCheckedException {
        client.call();
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }

}

