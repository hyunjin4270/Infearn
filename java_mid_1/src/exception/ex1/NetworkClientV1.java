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
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
            
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
            
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
