package ArrayList;

public class HwArray {
    public static void main(String[] args) {
        Analog<String> carnames = new Analog<>();
        //Add to array list
        carnames.add("Acura");
        carnames.add("Toyata");
        carnames.add("GMC");
        carnames.add("Nissan");
        carnames.add("Hyundai");
        System.out.println(carnames);

        System.out.println("carnames.remove( 2) = " + carnames.remove(2));
        System.out.println(carnames);

        System.out.println("carnames.get(3) = " + carnames.get(3));
        System.out.println("carnames.size() = " + carnames.size());
        carnames.clear();
        System.out.println(carnames);


    }
}