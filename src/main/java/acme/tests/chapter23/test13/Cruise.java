package acme.tests.chapter23.test13;

import java.io.*;
public class Cruise {
    private int numPassengers = 1;
    private transient String schedule = "NONE";
    {numPassengers = 2;}
    public Cruise() {
        this.numPassengers = 3;
        this.schedule = "Tropical Island";
    }
    public static void main(String... passengers) throws Exception {
        try (ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("ship.txt"))) {
            Cruise c = new Cruise();
            c.numPassengers = 4;
            c.schedule = "Casino";
            o.writeObject(c);
        }
        try (ObjectInputStream i = new ObjectInputStream(
                new FileInputStream("ship.txt"))) {
            Cruise c = (Cruise) i.readObject();
            System.out.print(c.numPassengers+","+c.schedule);
        }
    }
}
