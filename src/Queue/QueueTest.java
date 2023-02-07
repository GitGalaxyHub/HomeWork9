package Queue;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue <String> country = new MyQueue<String>();
        country.add("USA");
        System.out.println("country = " + country);
        country.add("Ukraine");
        System.out.println("country = " + country);
        //country.clear();
        country.add("Argentina");
        country.add("Andorra");
        country.add("Israel");
       country.add("Bolivia");
        country.add("Brazil");
        country.add("Belgium");
        country.add("Canada");
        country.add("China");
        System.out.println("country = " + country);
       System.out.println("country.peek() = " + country.peek());
        System.out.println("country.size() = " + country.size());
        System.out.println("country.pollFirst() = " + country.pollFirst());
        System.out.println(country);
    }
    }

