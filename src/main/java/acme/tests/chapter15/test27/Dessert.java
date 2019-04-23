package acme.tests.chapter15.test27;

import java.util.Optional;

public class Dessert {
    public static void main(String[] yum) {
        eatDessert(Optional.of("Cupcake"));
    }
    private static void eatDessert(Optional<String> opt) {
//        System.out.println(opt.orElse("No dessert today"));
//        System.out.println(opt.orElseGet(() -> "No dessert today"));
    }
}
