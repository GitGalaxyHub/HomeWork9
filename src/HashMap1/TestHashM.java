package HashMap1;

import java.util.HashMap;

public class TestHashM {
    public static void main(String[] args) {
        MyHashMa<String, Integer> userphone = new MyHashMa<>();
        System.out.println(userphone.size());
        userphone.put("Alex" , 12);
        userphone.put("Olha" , 2);
        userphone.put("Dima" , 2);
        userphone.put("Anton" , 2);
        System.out.println(userphone);
        userphone.clear();
        System.out.println(userphone);



    }
}
