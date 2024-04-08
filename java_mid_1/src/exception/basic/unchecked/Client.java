package exception.basic.unchecked;

public class Client {
    void call() {
        throw new MyUncheckedException("ex");
    }
    
}
