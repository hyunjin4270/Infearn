package exception.ex3;

import exception.ex3.exception.*;

public class NetworkClientV3 {
    private final String address;
    boolean connectError = false;
    boolean sendError = false;
    
    NetworkClientV3(String address) {
        this.address = address;
    }

    String connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " ���� ���� ����");
            
        }
        //���� ����
        System.out.println(address + " ���� ���� ����");
        return "success";
    }

    String send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + " ������ ������ ���� ����: " + data);
            
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
