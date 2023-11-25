package day39_a_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "lizard";
        lizard.numberOfClass = 10;
        lizard.skinColor = "camo";

        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "lizard";
        reptile.numberOfClass = 10;
        //reptile.skinColor = "camo";

        Animal animal = new Lizard();
        animal.name = "animal";
        animal.eat();
        System.out.println(animal);

        ///

    }
}
