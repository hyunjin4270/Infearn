package exception.ex2;

public class NetworkServiceV2_1 {

    void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //Ãß°¡
        
        client.connect();
        client.send(data);
        client.disconnect();
    }
    
}
