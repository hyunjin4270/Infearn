package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    boolean connectError = false;
    boolean sendError = false;
    
    NetworkClientV2(String address) {
        this.address = address;
    }

    String connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + "���� ���� ����");
            
        }
        //���� ����
        System.out.println(address + " ���� ���� ����");
        return "success";
    }

    String send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " ������ ������ ���� ����: " + data);
            
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
