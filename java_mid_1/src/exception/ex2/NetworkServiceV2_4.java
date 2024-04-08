package exception.ex2;

public class NetworkServiceV2_4 {

    void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //�߰�
        
        try {
            client.connect();
            client.send(data);
            
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[����] �ڵ�: " + e.getErrorCode() + ", �޼���: " + e.getMessage());
        }
        client.disconnect();
        
       
    }
    
}