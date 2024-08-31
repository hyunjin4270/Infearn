package collection.map.test;
import java.util.*;
public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        // 코드 작성

        List<String> set = definePrice(map);
        System.out.println(set);
    }

    private static List<String> definePrice(Map<String, Integer> map) {
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == 1000) {
                list.add(stringIntegerEntry.getKey());
            }
        }
        return list;
    }
}