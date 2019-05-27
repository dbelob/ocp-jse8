package acme.tests.chapter23.test67;

import java.util.function.BiFunction;
import java.util.function.IntSupplier;

class Shield {
}

public class Sword {
    public class Armor {
        int count;
//        public final Function<Shield, Sword, Armor> dress = (h, w) -> new Armor();
        public final BiFunction<Shield, Sword, Armor> dress = (h, w) -> new Armor();
//        public final IntSupplier<Integer> addDragon = () -> count++;
        public final IntSupplier addDragon = () -> count++;
    }

    public static void main(String[] knight) {
//        final Armor a = new Armor();
        Sword sword = new Sword();
        final Armor a = sword.new Armor();
        a.dress.apply(new Shield(), new Sword());
        a.addDragon.getAsInt();
    }
}
