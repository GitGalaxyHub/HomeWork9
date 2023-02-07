package ArrayList;

import java.util.Arrays;

public class Analog<E> {
    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Analog() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public void add(E value) {
        ensureCapacity();
        data[size++] = value;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removed = (E) data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removed;
    }
    public void clear() {
        size++;
        final Object[] es = data;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

   // public void clear() {
     //   Arrays.fill(data, null);
    //    size = 0;
    //}

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) data[index];
    }

    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
    }


