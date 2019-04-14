package acme.study_guide.assessment.test13;

import java.io.Console;

public class Example {
    public static void main(String[] args) {
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.println(line);
    }
}
