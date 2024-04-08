package exception.basic.unchecked;

/*
 * RuntimeException을 상속받은 예외는 언체크 예외가 ㅗ딘다
 */
public class MyUncheckedException extends RuntimeException{
    MyUncheckedException(String message) {
        super(message);
    }
    
}
