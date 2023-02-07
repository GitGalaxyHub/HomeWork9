package LinkedList;



public class MyLinkedList {
    public static void main(String[] args) {
        AnalogLinkedList<String> carma = new AnalogLinkedList<>();
        carma.add("Acura");
        carma.add("Toyota");
        carma.add("Mazda");
        carma.add("Hyundai");
        carma.add("Honda");
        carma.add("Kia");
        System.out.println(carma);

        System.out.println("carma.get(3) = " + carma.get(3));


    }
}
