package acme.tests.chapter14.test18;

import java.util.function.UnaryOperator;

public class Doll {
    private int layer;
    public Doll(int layer) {
        super();
        this.layer = layer;
    }
    public static void open(UnaryOperator<Doll> task, Doll doll) {
//        while((doll = task.accept(doll)) != null) {
        while((doll = task.apply(doll)) != null) {
            System.out.print("X");
        }
    }
    public static void main(String[] wood) {
        open(s -> {
            if(s.layer<=0) return null;
            else return new Doll(s.layer--);
        }, new Doll(5));
    }
}
