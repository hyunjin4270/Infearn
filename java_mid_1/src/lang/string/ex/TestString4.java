package lang.string.ex;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0, str.indexOf(".txt"));
        String extName = str.substring(str.indexOf(".txt"));
        System.out.println("filename = " + fileName);
        System.out.println("extname = " + extName);
    }
    
}
