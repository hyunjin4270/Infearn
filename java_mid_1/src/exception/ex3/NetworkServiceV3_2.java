package exception.ex3;

import exception.ex3.exception.*;

public class NetworkServiceV3_2 {

    void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가
        
        try {
            client.connect();
            client.send(data);
            
        } catch (SendExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getSendData() + ", 메시지: " + e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.println("[오류] 코드: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }
        
        
       
    }
    
}
