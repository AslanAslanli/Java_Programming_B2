package day34_c_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.species = "Generic Animal";
        animal1.numOfLegs = 0;
        animal1.walk();

        Dog dog1 = new Dog();
        dog1.species = "Golden retriever";
        dog1.numOfLegs = 4;
        dog1.bark();

        Lion lion1 = new Lion();
        lion1.species = "King Lion";
        lion1.numOfLegs = 4;
        lion1.roar();
        lion1.walk();


    }
}
