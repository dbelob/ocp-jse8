package acme.tests.chapter23.test72;

/* final */ interface Finder {
    default long find() {return 20;}
}
abstract class Wanda {
    abstract long find();
}
final class Waldo extends Wanda implements Finder {
    public long find() {return 40;}

    public static final void main(String[] pictures) {
        final Finder f = new Waldo();
        System.out.print(f.find());
    }
}
