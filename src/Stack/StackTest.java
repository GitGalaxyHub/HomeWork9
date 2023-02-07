package Stack;

import Queue.MyQueue;

public class StackTest {
    public static void main(String[] args) {
        MyStack<String> cars = new MyStack<>();
        cars.push("Mazda");
        cars.push("Toyota");
        cars.push("Mercedes");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        //cars.clear();
        //System.out.println("cars = " + cars);
        System.out.println("cars.size() = " + cars.size());
        System.out.println("cars.peek() = " + cars.peek());
        System.out.println("cars.pop() = " + cars.pop());
        System.out.println(cars);


    }
    }
