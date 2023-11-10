package day32_custom_classes;

public class Employee {

    String name;
    int ID;
    String jobTitle;
    double salary;

    @Override
    public String toString() {
        return "Employee" +
                "\n name: " + name +
                "\n ID: " + ID +
                "\n jobTitle: " + jobTitle +
                "\n salary: " + salary;
    }

    public Employee (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee (String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public void  goToMeeting(){
        System.out.println(name + " is going to meeting");
    }

}
