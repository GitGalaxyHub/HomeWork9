package HashMap;

public class HashMapTest {
    public static void main(String[] args){
        MyHashMap<String, Integer> salaries = new MyHashMap<>();
        salaries.put("Java", 100500);
        salaries.put("Python", 19500);
        salaries.remove("Java");
        //salaries.clear();
        System.out.println("salaries = " + salaries);
        System.out.println("salaries.size() = " + salaries.size());
        System.out.println("salaries.get(\"Python\") = " + salaries.get("Python"));


    }


}
