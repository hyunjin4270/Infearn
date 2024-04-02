package lang.wrapper.ex;

import java.util.ArrayList;

public class abc {
    public static void main(String[] args) {
        String str = "ABC"; // String
		Integer i = 123; // Integer
		ArrayList<String> list = new ArrayList<String>(); // ArrayList
		
		System.out.println(str.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(list.getClass().getName()); // Type »Æ¿Œ
    }
}
