package acme.tests.chapter12.test19;

public class Bottle {
    public static class Ship {
        private enum Sail { // w1
            TALL {protected int getHeight() {return 100;}},
            SHORT {protected int getHeight() {return 2;}};
            protected abstract int getHeight();
        }
        public Sail getSail() {
            return Sail.TALL;
        }
    }
    public static void main(String[] stars) {
        Bottle bottle = new Bottle();
//        Ship q = bottle.new Ship(); // w2
        Ship q = new Ship(); // w2
        System.out.print(q.getSail());
    }
}
