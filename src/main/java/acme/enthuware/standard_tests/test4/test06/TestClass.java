package acme.enthuware.standard_tests.test4.test06;

import java.util.function.Function;

class TestClass {
    public double process(double payment, int rate) {
        double defaultrate = 0.10;        //1
        if (rate > 10) defaultrate = rate;  //2
        class Implement {
            public int apply(double data) {
//                Function<Integer, Integer> f = x -> x + (int) (x * defaultrate);  //3
                Function<Integer, Integer> f = x->x+(int)(x*rate);
                return f.apply((int) data); //4
            }
        }
        Implement i = new Implement();
        return i.apply(payment);
    }
}
