package exception.ex0;

public class NetworkClientV0 {
    private final String address;
    NetworkClientV0(String address) {
        this.address = address;
    }

    String connect() {
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "address";
    }

    String send(String data) {
        //전송성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    void disconnect() {
        System.out.println(address + " 서버 연결 헤제");
    }
    
}
