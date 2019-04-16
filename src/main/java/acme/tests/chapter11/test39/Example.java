package acme.tests.chapter11.test39;

public class Example {
    class Building {}
    class House extends Building{}

    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }
}
