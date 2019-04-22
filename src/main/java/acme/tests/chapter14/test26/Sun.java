package acme.tests.chapter14.test26;

import java.util.function.IntToLongFunction;
import java.util.function.UnaryOperator;

public class Sun {
    public static void dawn(IntToLongFunction sunrise) {}
    public static void main(String... rays) {
        dawn(s -> s+1);
    }
}
