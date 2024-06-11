package collection.set.test;
import java.util.*;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 = " + union);
        Set<Integer> intersection = new TreeSet<>();
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        System.out.println("교집합 = " + intersection);

    }
}