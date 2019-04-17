package acme.tests.chapter12.test37;

abstract interface CanSwim {
    public void swim();
}

public class Turtle {
    public static void main(String[] seaweed) {
        int distance = 7;
        CanSwim seaTurtle = new CanSwim() {
            @Override
            public void swim() {
                System.out.print(distance);
            }
        };
        seaTurtle.swim();
    }
}
