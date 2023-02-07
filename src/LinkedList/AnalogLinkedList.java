package LinkedList;

import ArrayList.Analog;

class AnalogLinkedList<T> {

    private Node head;
    private int size;

    private class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }

    public AnalogLinkedList() {
        head = null;
        size = 0;
    }

    // добавляет элемент в конец
    public void add(Object value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node last = getNode(size - 1);
            last.next = newNode;
            newNode.prev = last;
        }

        size++;
    }

    // удаляет элемент под индексом
    public void remove(int index) {
        Node current = getNode(index);
        Node prev = current.prev;
        Node next = current.next;

        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }

        if (next != null) {
            next.prev = prev;
        }

        size--;
    }

    // очищает коллекцию
    public void clear() {
        head = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает элемент под индексом
    public Object get(int index) {
        Node current = getNode(index);
        return current.data;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }
    //выводит в консоль лист


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");

            Node current = head;
            for (int i = 0; i < size; i++) {
                sb.append(current.data);
                if (i < size - 1) {
                    sb.append(", ");
                }
                current = current.next;
            }

            sb.append("]");

            return sb.toString();
        }

    }

