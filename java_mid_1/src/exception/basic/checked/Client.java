package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {

        //���� ��Ȳ
        throw new MyCheckedException("ex");
    }
    
}
