package day38_a_abstraction_interface.language;

public class Translator {
    public static void main(String[] args) {

        Spanish obj2 = new Spanish();
        obj2.hi();
        obj2.bye();

        Azerbaijani obj3 = new Azerbaijani();
        obj3.hi();
        obj3.bye();

        System.out.println(Language.PLANET);

    }
}
