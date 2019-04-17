package acme.tests.chapter12.test34;

public enum Proposition {
    TRUE(-10) { @Override public String getNickName() { return "RIGHT"; }},
    FALSE(-10) { public String getNickName() { return "WRONG"; }},
    UNKNOWN(0) { @Override public String getNickName() { return "LOST"; }};
    private final int value;
    Proposition(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    protected abstract String getNickName();
}
