package exception.basic.checked;

/*
 *  Expection을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception{
    MyCheckedException(String message) {
        super(message);
    }
    
}
