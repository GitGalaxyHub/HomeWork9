package HashMap;


import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap<K, V> {

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] list;
    private int size;

    public MyHashMap() {
        list = new LinkedList[10];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % list.length;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (list[index] == null) {
            list[index] = new LinkedList<>();
        }

        for (Node node : list[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        list[index].addLast(new Node(key, value));
        size++;
    }

    public void remove(K key) {
        int index = hash(key);

        if (list[index] == null) {
            return;
        }

        for (Node node : list[index]) {
            if (node.key.equals(key)) {
                list[index].remove(node);
                size--;
                return;
            }
        }


    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = hash(key);

        if (list[index] == null) {
            return null;
        }

        for (Node node : list[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }
    public void si() {
        int si = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                si += list[i].size();
            }
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}




