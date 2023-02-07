package Stack;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T value) {
        list.addLast(value);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        return list.getLast();
    }

    public T pop() {
        T value = list.getLast();
        list.removeLast();
        return value;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Object item : list) {
            sb.append(item).append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }



}
