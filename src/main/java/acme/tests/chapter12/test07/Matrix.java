package acme.tests.chapter12.test07;

// What is the output of the following application?
public class Matrix {
    private int level = 1;
    class Deep {
        private int level = 2;
        class Deeper {
            private int level = 5;
            public void printReality() {
                System.out.print(level);
                System.out.print(" "+Matrix.Deep.this.level);
                System.out.print(" "+Deep.this.level);
            }
        }
    }
    public static void main(String[] bots) {
        Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
        simulation.printReality();
    }
}
// A. 1 1 2
// B. 5 2 2
// C. 5 2 1
// D. The code does not compile.
