package generic.test.ex1;

import generic.ex2.Box;

public class Container<T> {
    private T item;
    public Boolean isEmpty() {
        return item != null;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
