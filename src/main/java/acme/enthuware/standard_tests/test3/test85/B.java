package acme.enthuware.standard_tests.test3.test85;

// Consider the following code:
class A
{
    A() {  print();   }
    private void print() { System.out.println("A"); }
}
class B extends A
{
    int i = Math.round(3.5f);
    public static void main(String[] args)
    {
        A a = new B();
        a.print();
    }
    void print() { System.out.println(i); }
}
// What will be the output when class B is run ?
//
// A. It will print A, 4.
// B. It will print A, A
// C. It will print 0, 4
// D. It will print 4, 4
// E. None of the above.
