package acme.tests.chapter15.test17;

import java.util.Optional;

public class Example {
    private static void longer(Optional<Boolean> opt) {
        if (opt.isPresent())
        System.out.println("run: " + opt.get());
    }
    private static void shorter(Optional<Boolean> opt) {
        opt.map(x -> "run: " + x).ifPresent(System.out::println);
    }
}
