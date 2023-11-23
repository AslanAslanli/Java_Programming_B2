package day38_a_abstraction_interface.animal;

import day34_c_inheritance.animals.Animal;
import day38_a_abstraction_interface.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("parrot eats with its beak");
    }
    public void fly() {
        System.out.println("parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HI HI");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE");
    }
}
