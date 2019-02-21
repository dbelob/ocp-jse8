package acme.study_guide.chapter06.review_questions.question14;

public class AhChoo {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException /* | SniffleException */ e) {
            //???
            throw e;
        }
    }
}
