package acme.tests.chapter14.test23;

import java.util.ArrayList;
import java.util.List;

class Boss {
    private String name;
    public Boss(String name) {
        this.name = name;
    }
    public String getName() {return name.toUpperCase();}
    public String toString() {return getName();}
}
public class Initech {
    public static void main(String[] reports) {
        final List<Boss> bosses = new ArrayList(8);
        bosses.add(new Boss("Jenny"));
        bosses.add(new Boss("Ted"));
        bosses.add(new Boss("Grace"));
//        bosses.removeIf(s -> s.equalsIgnoreCase("ted"));
        bosses.removeIf(s -> s.getName().equalsIgnoreCase("ted"));
        System.out.print(bosses);
    }
}
