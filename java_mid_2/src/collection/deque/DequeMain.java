package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void run() {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);

        //다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());

        //스택 요소 뽑기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println(deque);


        // 큐 다시 추가
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);

        // 큐 요소 뽑기
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }

    public static void main(String[] args) {
        run();
    }
}
