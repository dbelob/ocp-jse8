package acme.enthuware.standard_tests.test2.test63;

import java.util.List;

// The signature of a method in a class is as follows:
//    public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
//
// This method is being called in the following code:
//    result = doIt(in);
//
// Given that String implements CharSequence interface,
// what should be the reference type of 'in' and 'result' variables?
public class Example {
    public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
        return null;
    }

    public static void main(String[] args) {
        //result = doIt(in);
    }
}
// A
// ArrayList<String> in;
// List<CharSequence> result;
//
// B
// List<String> in;
// List<Object> result;
//
// C
// ArrayList<String> in;
// List result;
//
// D
// List<CharSequence> in;
// List<CharSequence> result;
//
// E
// ArrayList<Object> in;
// List<CharSequence> result;
//
// F
// None of these.
