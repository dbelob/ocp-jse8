package acme.tests.chapter11.test18;

public class Example {
    class Building {}
    class House extends Building{}

    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        Building p = (House) b;
//        House q = (Building) h;
        Building r = (Building) bh;
        House s = (House) bh;
    }
}
