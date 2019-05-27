package acme.tests.chapter23.test40;

import java.util.Properties;

public class Example {
    public static void main(String[] args) {
        Properties props = new Properties();

//        System.out.print(props.getDefaultProperty("mystery", "?"));
        System.out.print(props.getProperty("mystery", "?"));
        System.out.print(" ");
//        System.out.print(props.getDefaultProperty("more", "?"));
        System.out.print(props.getProperty("more", "?"));
    }
}
