package exception.basic.unchecked;

/*
 * UnChecked ���ܴ�
 * ���ܸ� ��ų�, ������ �ʾƵ� �ȴ�
 * ���ܸ� ���� ������ �ڵ����� ������ ������
 */
public class Service {

    Client client = new Client();

    /*
     * �ʿ��� ��� ���ܸ� ��Ƽ� ó���� �� �ִ�
     */
    void callCatch() {
        try {
            client.call();
        } catch(MyUncheckedException e) {
            System.out.println("���� ó��, message = " + e.getMessage());
        }
        System.out.println("���� ����");
    }

    /*
     * ���ܸ� ���� �ʾƵ� �ȴ�
     * �ڿ������� ������ �Ѿ��
     * üũ ���ܿ� �ٸ��� throws ���� ������ ���� �ʾƵ� �˴ϴ�
     */
    void callThrow() {
        client.call();
    }
    
}
