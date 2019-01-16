package acme.study_guide.chapter3.review_questions.question13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();

//        ArrayDeque<?> list = new ArrayDeque<String>();
        ArrayList<? super Date> list = new ArrayList<Date>();
//        List<?> list = new ArrayList<?>();
//        List<Exception> list = new LinkedList<IOException>();
//        Vector<? extends Number> list = new Vector<Integer>();

        card.showSize(list);
    }
}
