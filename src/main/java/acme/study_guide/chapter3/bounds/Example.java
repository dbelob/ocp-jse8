package acme.study_guide.chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class Example {
    static class Bird {
    }

    static class Sparrow extends Bird {
    }

    static class ColorSparrow extends Sparrow {
    }

    public static void main(String[] args) {
        List<Sparrow> sparrows = new ArrayList<>();
        sparrows.add(new Sparrow());
        sparrows.add(new Sparrow());
        sparrows.add(new Sparrow());
        List<Bird> birds = new ArrayList<>(sparrows);

        addSoundUnbounded(sparrows);
        addSoundUnbounded(birds);

        addSoundUpperBounded(sparrows);
        addSoundUpperBounded(birds);

        addSoundLowerBounded(sparrows);
        addSoundLowerBounded(birds);
    }

    private static void addSoundUnbounded(List<?> list) {
//        list.add(new Bird());
//        list.add(new Sparrow());
        list.remove(0);
    }

    private static void addSoundUpperBounded(List<? extends Bird> list) {
//        list.add(new Bird());
//        list.add(new Sparrow());
        list.remove(0);
    }

    private static void addSoundLowerBounded(List<? super Sparrow> list) {
//        list.add(new Bird());
        list.add(new Sparrow());
        list.add(new ColorSparrow());
        list.remove(0);
    }

    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }
}