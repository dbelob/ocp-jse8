package acme.study_guide.chapter1.access_modifiers.cat;

public class CatAdmirer {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
    }
}