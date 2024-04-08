package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    boolean connectError = false;
    boolean sendError = false;
    
    NetworkClientV1(String address) {
        this.address = address;
    }

    String connect() {
        if (connectError) {
            System.out.println(address + " ���� ���� ����");
            return "connectError";
            
        }
        //���� ����
        System.out.println(address + " ���� ���� ����");
        return "success";
    }

    String send(String data) {
        if (sendError) {
            System.out.println(address + " ������ ������ ���� ����: " + data);
            return "sendError";
            
        }
        //���ۼ���
        System.out.println(address + " ������ ������ ����: " + data);
        return "success";
    }

    void disconnect() {
        System.out.println(address + " ���� ���� ����");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;

        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
    
}
