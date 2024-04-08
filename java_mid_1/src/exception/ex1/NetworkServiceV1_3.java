package exception.ex1;

public class NetworkServiceV1_3 {

    void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //�߰�
        
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[��Ʈ��ũ ���� �߻�] ���� �ڵ�: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[��Ʈ��ũ ���� �߻�] ���� �ڵ�: " + sendResult);
            }
        }

         
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
    
}
