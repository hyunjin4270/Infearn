package exception.ex0;

public class NetworkClientV0 {
    private final String address;
    NetworkClientV0(String address) {
        this.address = address;
    }

    String connect() {
        //���� ����
        System.out.println(address + "���� ���� ����");
        return "address";
    }

    String send(String data) {
        //���ۼ���
        System.out.println(address + " ������ ������ ����: " + data);
        return "success";
    }

    void disconnect() {
        System.out.println(address + " ���� ���� ����");
    }
    
}
