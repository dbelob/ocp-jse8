package acme.study_guide.chapter04.using_variables_in_lambdas;

interface Gorilla {
    String move();
}

class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }
}
