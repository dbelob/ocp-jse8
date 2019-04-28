package acme.tests.chapter18.test12;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    private List<String> activities = new ArrayList<>();
    private static Itinerary getItinerary(String name) {
        return null;
    }
    public static void printItinerary() throws Exception {
//        Console c = new Console();
        Console c = System.console();
        final String name = c.readLine("What is your name?");
        final Itinerary stuff = getItinerary(name);
        stuff.activities.forEach(s -> c.printf(s));
    }
    public static void main(String[] holidays) throws Exception {
        printItinerary();
    }
}
