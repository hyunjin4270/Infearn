package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA",
                "30000"}};
        Map<String, Integer> productMap = arrayToMap(productArr);
        printMap(productMap);
    }

    private static Map<String, Integer> arrayToMap(String[][] productArr) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] array : productArr) {
            map.put(array[0], Integer.parseInt(array[1]));
        }
        return map;
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println("제품 : " + key + ", 가격: " + map.get(key));
        }
    }
}