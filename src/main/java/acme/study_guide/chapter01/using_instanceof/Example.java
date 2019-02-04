package acme.study_guide.chapter01.using_instanceof;

class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }
interface Mother {}

public class Example {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;        // true
        boolean b2 = hippo instanceof HeavyAnimal;  // true
        boolean b3 = hippo instanceof Elephant;     // false
        boolean b4 = hippo instanceof Object;       // true

        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;   // false

        Hippo anotherHippo = new Hippo();
//        boolean b5a = anotherHippo instanceof Elephant;  // DOES NOT COMPILE

        boolean b6 = hippo instanceof Mother;
    }
}
