package acme.tests.chapter16.test35;

public class Tale {
    class BearException extends RuntimeException {}
    class WolfException extends RuntimeException {}
    class DragonException extends RuntimeException {}
    public int tellStory() {
        try {} catch (BearException d) {
//            d = new RuntimeException();
            throw d;
        } catch (WolfException | DragonException e) {
//            e = new RuntimeException();
            throw e;
        }
        return 3;
    }
    public static void main(String... wand) throws RuntimeException{
        new Tale().tellStory();
    }
}
