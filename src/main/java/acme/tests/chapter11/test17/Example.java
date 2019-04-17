package acme.tests.chapter11.test17;

import java.util.ArrayList;
import java.util.Collection;

// How many lines of the main method fail to compile?
public class Example {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    public static void main(String[] args) {
        Bus bus = new Bus();

//        System.out.println(null instanceof Bus);
//        System.out.println(bus instanceof Vehicle);
//        System.out.println(bus instanceof Bus);
//        System.out.println(bus instanceof ArrayList);
//        System.out.println(bus instanceof Collection);
    }
}
// A. One
// B. Two
// C. Three
// D. Four
