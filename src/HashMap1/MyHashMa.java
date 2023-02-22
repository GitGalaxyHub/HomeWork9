package HashMap1;

import java.util.Arrays;

public class MyHashMa <K, V> {
    private class Entry<K,V>{
        private K key;
        private V value;
        private Entry<K,V> next;
        public Entry(K key,V value){
            this.key=key;
            this.value=value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }


    }

    private final int SIZE = 5;
    private Entry<K,V> table[];
    public MyHashMa(){
        table =new Entry[SIZE];
    }


    public void put(K key,V value){
        int hash =key.hashCode() % SIZE;
        Entry<K,V> e =table[hash];

        if (e==null){
            table[hash] = new Entry<K ,V>(key,value);
        }else {
            while (e.next !=null){
                if (e.getKey()==key){
                    e.setValue(value);
                    return;
                }
                e=e.next;

            }
            if (e.getKey()==key){
                e.setValue(value);
                return;
            }
            e.next = new Entry<K,V>(key,value);
        }


    }
    public  V get(K key){
        int hash= key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e==null){
            return  null;
        }
        while (e !=null){
            if (e.getKey() == key) {
                return e.getValue();

            }
            e=e.next;
        }
        return null;
    }
public Entry<K,V> remove(K key) {
    int hash = key.hashCode() % SIZE;
    Entry<K, V> e = table[hash];
    if (e == null) {
        return null;
    }
    if (e.getKey()==key){
        table[hash]=e.next;
        e.next=null;
        return e;
    }
    Entry<K,V> pev =e;
    e=e.next;
    while (e!=null){
        if(e.getKey()==key){
            pev.next=e.next;
            e.next =null;
            return e;
        }

    }
    return null;
}
    public int size(){
        int count = 0;
        for(int i = 0; i < table.length; i++) {
            Entry<K,V> e = table[i];
            while(e != null) {
                count++;
                e = e.next;
            }
        }
        return count;

}
    public void clear() {
        Arrays.fill(table, null);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for(int i = 0; i < table.length; i++) {
            Entry<K,V> e = table[i];
            while(e != null) {
                sb.append(e.getKey() + "=" + e.getValue() + ", ");
                e = e.next;
            }
        }
        sb.append("}");
        return sb.toString();
    }

}





