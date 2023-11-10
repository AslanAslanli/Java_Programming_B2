package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Aslan", "SDET");
        System.out.println(emp1);

        Employee emp2 = new Employee("Nadir", "SDET", 101, 100_000);
        System.out.println(emp2);

        emp1.goToMeeting();
        emp2.goToMeeting();


    }
}
