package acme.tests.chapter16.test29;

import java.io.IOException;

class CarCrash extends RuntimeException {}
public class Car {
    public static void main(String[] seatbelts) throws Exception { // w1
        try {
            throw new IOException("Auto-pilot error");
//        } catch (Exception | CarCrash e) { // w2
//            throw e;
        } catch (Exception a) { // w3
            throw a;
        }
    }
}
