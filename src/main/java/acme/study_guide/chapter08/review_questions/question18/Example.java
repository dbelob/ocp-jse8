package acme.study_guide.chapter08.review_questions.question18;

import java.io.Console;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();
        String color = console.readLine("What is your favorite color? ");
        console.printf("Your favorite color is " + color);
        console.format("Your favorite color is " + color);
        console.writer().println("Your favorite color is " + color);
    }
}
