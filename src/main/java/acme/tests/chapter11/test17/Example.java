package acme.tests.chapter11.test17;

import java.util.ArrayList;
import java.util.Collection;

// How many lines of the main method fail to compile?
// (after deleting comment characters in five lines)
public class Example {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    public static void main(String[] args) {
        Bus bus = new Bus();

//        System.out.println(null instanceof Bus);          // line 17
//        System.out.println(bus instanceof Vehicle);       // line 18
//        System.out.println(bus instanceof Bus);           // line 19
//        System.out.println(bus instanceof ArrayList);     // line 20
//        System.out.println(bus instanceof Collection);    // line 21
    }
}
// A. One
// B. Two
// C. Three
// D. Four
