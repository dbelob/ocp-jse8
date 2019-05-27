package acme.tests.chapter23.test19;

import java.util.OptionalInt;
import java.util.stream.Stream;

class Runner {
    private int numberMinutes;

    public Runner(int n) {
        numberMinutes = n;
    }

    public int getNumberMinutes() {
        return numberMinutes;
    }
}

public class Marathon {
    public static void main(String[] args) {
        Stream<Runner> runners = Stream.of(new Runner(183),
                new Runner(161), new Runner(201));
        OptionalInt opt = runners
//                .map(Runner::getNumberMinutes)
//                .peek(System.out::println).max();
                .mapToInt(Runner::getNumberMinutes)
                .peek(System.out::println).max();
    }
}
