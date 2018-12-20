package acme.study_guide.chapter1.creating_nested_classes.local_inner_classes;

public class Outer {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }

    public void isItFinal() {
        final int one = 20;
        int two = one;
        two++;
        int three;
        if (one == 4) three = 3;
        else three = 4;
        int four = 4;
        class Inner {
        }
        four = 5;
    }
}