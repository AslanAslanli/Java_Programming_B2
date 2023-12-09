package day35_inheritance.person;

public class Runner {
    public static void main(String[] args) {

        Person obj1 = new Person();
        obj1.name = "Eyad";
        obj1.age = 25;
        obj1.favHobby = "Java";
        obj1.talk();
        //obj1.study();
        //.study() is in child class and parent class cant read
        // child class's methods nor variables


        Student student1 = new Student();
        student1.name = "Valentina";
        student1.age = 23;
        student1.favHobby = "Of courseJava";
        student1.talk();
        student1.study();
        student1.grades = 'A';
        System.out.println(student1.grades);


    }
}
