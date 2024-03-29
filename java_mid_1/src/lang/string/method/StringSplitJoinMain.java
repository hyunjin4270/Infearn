package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println(string);
            
        }

        String joinStr = "";

        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
            
        }
        System.out.println("joinStr = " + joinStr);
        //join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);
    }
    
}
