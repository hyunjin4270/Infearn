import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // 1. LinkedHashMap 생성
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        // 2. 데이터 추가: 삽입 순서를 유지
        linkedMap.put("apple", 10);
        linkedMap.put("banana", 20);
        linkedMap.put("orange", 30);

        // 3. 데이터 출력: 삽입 순서 유지 여부 확인
        System.out.println("LinkedHashMap: " + linkedMap);
        // 출력: LinkedHashMap: {apple=10, banana=20, orange=30}

        // 4. 특정 키에 대한 값 가져오기
        int orangeCount = linkedMap.get("orange");
        System.out.println("Count of oranges: " + orangeCount); // Count of oranges: 30

        // 5. 데이터 제거
        linkedMap.remove("banana");
        System.out.println("After removal: " + linkedMap); // After removal: {apple=10, orange=30}

        // 6. 모든 키-값 쌍을 순회하면서 출력 (삽입 순서대로)
        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // 출력:
        // apple: 10
        // orange: 30
    }
}
