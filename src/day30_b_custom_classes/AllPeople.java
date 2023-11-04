package day30_b_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

//        String name = "Test";
//        System.out.println(name);

        Person personOne = new Person();
        Person personTwo = new Person();

        System.out.println("Person one name: " + personOne.name);
        personOne.name = "Majd";
        System.out.println("Person one name: " + personOne.name);
        personOne.age = 29;
        personOne.height = 5.9;
        personOne.isMarried = true;

        System.out.println("----------------------------");
        System.out.println("Person two name: " + personTwo.name);
        personTwo.name = "Sofia";
        System.out.println("Person two name: " + personTwo.name);
        personTwo.age = 27;
        personTwo.height = 5.7;
        personTwo.isMarried = false;






    }
}
