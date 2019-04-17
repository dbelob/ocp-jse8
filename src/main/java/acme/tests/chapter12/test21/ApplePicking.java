package acme.tests.chapter12.test21;

interface Edible {
    void eat();
}

public class ApplePicking {
    public static void main(String[] food) {
        Edible apple = new Edible() {
            @Override
//            void eat() {
            public void eat() {
                System.out.print("Yummy!");
            }
//        }
        };
    }
}
