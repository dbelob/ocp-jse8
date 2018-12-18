package acme.study_guide.chapter1.understanding_virtual_method_invocation;

abstract class Animal {
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
}
class Lion extends Animal {
    String name = "Leo";
}
public class PlayWithAnimal {
    public static void main(String... args) {
        Animal animal = new Lion();
        animal.printName();
    }
}