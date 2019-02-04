package acme.study_guide.chapter01.access_modifiers.mouse;

import acme.study_guide.chapter01.access_modifiers.cat.BigCat;

public class Mouse {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
    }
}
