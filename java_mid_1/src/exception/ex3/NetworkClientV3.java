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
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
            
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    String send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
            
        }
        //전송성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    void disconnect() {
        System.out.println(address + " 서버 연결 헤제");
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
