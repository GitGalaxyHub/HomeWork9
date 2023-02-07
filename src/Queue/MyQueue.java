package Queue;


import java.util.NoSuchElementException;
public class MyQueue <T> {
    private Object[] elements;
    private int size = 0;
    private int head = 0;
    private int tail = 0 ;
    private static final int DEFAULT_CAPACITY = 10;

    public MyQueue() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//public class MyQueue<T> {

    //private Object[] elements;
 //   private int head;
   // private int tail;
    //private int size;

   // public MyQueue() {
        //elements = new Object[];
        //head = 0;
       // tail = 0;
      //  size = 0;
    //}
    static final <T> T elementAt(Object[] es, int i) {
        return (T) es[i];
    }
    static final int inc(int i, int modulus) {
        if (++i >= modulus) i = 0;
        return i;
    }


    public void add(Object value) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }

        elements[tail] = value;
        tail = (tail + 1) % elements.length;
        size++;
    }


    public void clear() {
        size++;
        final Object[] es = elements;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

    public int size() {
        return size;
    }


    public T peek() {
        return (T) elements[head];
    }
    public  T pollFirst() {
        final Object[] es;
        final int h;
        T e = elementAt(es = elements, h = head);
        if (e != null) {
            es[h] = null;
            head = inc(h, es.length);
        }
        return e;
    }

    public T removeFirst() {
        T e = pollFirst();
        if (e == null)
            throw new NoSuchElementException();
        return e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Object item : elements) {
            sb.append(item).append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }


}