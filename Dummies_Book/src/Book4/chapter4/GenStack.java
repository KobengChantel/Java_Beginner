package Book4.chapter4;

import java.util.LinkedList;

public class GenStack<E> {
    private LinkedList<E> list = new LinkedList();

    public GenStack() {
    }

    public void push(E item) {
        this.list.addFirst(item);
    }

    public E pop() {
        return this.list.poll();
    }

    public E peek() {
        return this.list.peek();
    }

    public boolean hasItems() {
        return !this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }
}

