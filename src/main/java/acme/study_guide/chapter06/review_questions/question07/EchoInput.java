package acme.study_guide.chapter06.review_questions.question07;

public class EchoInput {
    public static void main(String[] args) {
        if (args.length <= 3) assert false;
        System.out.println(args[0] + args[1] + args[2]);
    }
}
