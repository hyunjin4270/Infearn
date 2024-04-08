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
            throw new NetworkClientExceptionV2("connectError", address + "서버 연결 실패");
            
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    String send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            
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
