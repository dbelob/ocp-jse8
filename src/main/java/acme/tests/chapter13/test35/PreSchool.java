package acme.tests.chapter13.test35;

import java.util.Arrays;
import java.util.List;

class Blankie {
    String color;
    String getColor() {
        return color;
    }
}
public class PreSchool {
    public static void main(String[] args) {
        Blankie b1 = new Blankie();
        Blankie b2 = new Blankie();
        b1.color = "pink";
        List<Blankie> list = Arrays.asList(b1, b2);
//        list.stream().filter(Blankie::getColor).forEach(System.out::println);
        list.stream().filter((b) -> b.getColor() != null).forEach(System.out::println);
    }
}
