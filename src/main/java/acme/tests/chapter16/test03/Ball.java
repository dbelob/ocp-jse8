package acme.tests.chapter16.test03;

class LostBallException extends Exception {}
public class Ball {
    public void toss() throws LostBallException {
        throw new ArrayStoreException();
    }
    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}
