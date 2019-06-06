package acme.enthuware.standard_tests.test3.test50;

interface I1 {
    void m1() throws java.io.IOException;
}

interface I2 {
    void m1() throws java.sql.SQLException;
}

public class Example implements I1, I2 {
    @Override
    public void m1() {
        System.out.println("Hi there");
    }
}
