package collection.map.test;
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        // 코드 작성
        Map<String, Integer> fruitStr = StringToMap(text);
        System.out.println(fruitStr);
    }

    private static Map<String, Integer> StringToMap(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] texts = text.split(" ");
        for (String str : texts) {
            if (map.containsKey(str)) {
                map.replace(str, (map.get(str) + 1));
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }


}