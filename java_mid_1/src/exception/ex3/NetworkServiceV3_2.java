package exception.ex3;

import exception.ex3.exception.*;

public class NetworkServiceV3_2 {

    void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //�߰�
        
        try {
            client.connect();
            client.send(data);
            
        } catch (SendExceptionV3 e) {
            System.out.println("[���� ����] �ּ� : " + e.getSendData() + ", �޽���: " + e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.println("[����] �ڵ�: " + e.getAddress() + ", �޼���: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[�� �� ���� ����] �޽���: " + e.getMessage());
        }finally {
            client.disconnect();
        }
        
        
       
    }
    
}
