package acme.enthuware.standard_tests.last_day_test.test28;

// What will be the output of the following program?
class Test {
    static int i1, i2, i3;

    public static void main(String[] args) {
        try {
            test(i1 = 1, oops(i2 = 2), i3 = 3);
        } catch (Exception e) {
            System.out.println(i1 + " " + i2 + " " + i3);
        }
    }

    static int oops(int i) throws Exception {
        throw new Exception("oops");
    }

    static int test(int a, int b, int c) {
        return a + b + c;
    }
}
// You had to select 1 option
//
// A.
// 1 0 0
//
// B.
// 1 2 0
//
// C.
// 1 2 3
//
// D.
// 0 0 0
//
// E.
// It will not compile.
