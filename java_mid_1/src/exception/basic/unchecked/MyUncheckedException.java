package exception.basic.unchecked;

/*
 * RuntimeException�� ��ӹ��� ���ܴ� ��üũ ���ܰ� �ǵ��
 */
public class MyUncheckedException extends RuntimeException{
    MyUncheckedException(String message) {
        super(message);
    }
    
}
