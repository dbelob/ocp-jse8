package acme.study_guide.chapter08.interacting_with_users.the_new_way;

import java.io.Console;

public class ConsoleSample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }
    }
}
