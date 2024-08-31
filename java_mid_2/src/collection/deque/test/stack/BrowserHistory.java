package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> site = new ArrayDeque<>();
    public void visitPage(String s) {
        site.push(s);
        System.out.println("방문: " + s);
    }

    public String goBack() {
        site.pop();
        System.out.println("뒤로 가기: " + site.peek());
        return site.peek();
    }
}
