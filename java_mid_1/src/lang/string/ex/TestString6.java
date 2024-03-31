package lang.string.ex;

public class TestString6 {
    public static void main(String[] args) {
        String str = "Start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf(key, index + 1);
            if (index != -1) {
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
