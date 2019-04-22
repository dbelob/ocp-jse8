package acme.tests.chapter14.test28;

import java.util.function.BiFunction;

public class Dance {
    public static Integer rest(BiFunction<Integer,Double,Integer> takeABreak) {
        return takeABreak.apply(3, 10.2);
    }
    public static void main(String[] participants) {
        rest((s,e) -> s.intValue()+e.intValue());
    }
}
