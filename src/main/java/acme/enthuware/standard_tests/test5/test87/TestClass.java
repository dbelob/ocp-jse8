package acme.enthuware.standard_tests.test5.test87;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class TestClass {
    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;  //1
        int x = operate(fo.apply(20)); //2
        System.out.println(x);
    }
}
