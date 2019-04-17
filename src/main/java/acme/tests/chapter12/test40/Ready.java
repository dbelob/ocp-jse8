package acme.tests.chapter12.test40;

public class Ready {
    protected static int first = 2;
    private final static short DEFAULT_VALUE = 10;
    private static class GetSet {
        int first = 5;
        static int second = DEFAULT_VALUE;
    }
    private GetSet go = new GetSet();
    public static void main(String[] begin) {
        Ready r = new Ready();
        System.out.print(r.go.first);
        System.out.print(", "+r.go.second);
    }
}
