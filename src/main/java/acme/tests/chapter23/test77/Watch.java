package acme.tests.chapter23.test77;

class SmartWatch extends Watch {
    private String getType() {
        return "smart watch";
    }

    public String getName() {
        return getType() + ",";
    }
}

public class Watch {
    private String getType() {
        return "watch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        Watch smartWatch = new SmartWatch();
        System.out.print(watch.getName(","));
        System.out.print(smartWatch.getName(""));
    }
}
