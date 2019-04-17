package acme.tests.chapter12.test38;

interface Toy { String play(); }
public class Gift {
    public static void main(String[] matrix) {
        abstract class Robot {}
        class Transformer extends Robot implements Toy {
            public String name = "GiantRobot";
            public String play() {return "DinosaurRobot";}
        }
        Transformer prime = new Transformer () {
            public String play() {return name;} // y1
        };
        System.out.print(prime.play()+" "/*+name*/);
    }
}
