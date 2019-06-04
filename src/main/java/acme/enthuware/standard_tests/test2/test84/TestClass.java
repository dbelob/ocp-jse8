package acme.enthuware.standard_tests.test2.test84;

import java.util.Arrays;
import java.util.List;

interface Carnivore {
    default int calories(List<String> food) {
        return food.size() * 100;
    }

    int eat(List<String> foods);
}

class Tiger implements Carnivore {
    public int eat(List<String> foods) {
        System.out.println("Eating " + foods);
        return foods.size() * 200;
    }
}

public class TestClass {
    public static int size(List<String> names) {
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t = new Tiger();

        process(fnames, t::eat);
        process(fnames, t::calories);
        process(fnames, TestClass::size);
//        process(fnames, Carnivore::calories);
//        process(fnames, Tiger::eat);
    }
}
