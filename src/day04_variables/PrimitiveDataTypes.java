package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte age = 80; //I declared a variable called age who has byte datatype and it is assigned a value number 50

        System.out.println("50"); // Hardcoded -- mean you have to change it manually
        System.out.println("age"); // Hardcoded
        System.out.println(age + "\n"); // Dynamic -- variable based, changeable

       // byte age = 95; //In Java, we canNOT declare SAME variable name more than ONCE
        age = 100; //as long as we dont declare a varibale twice, we can always reassign a value to it
        // byte age2 = 950; //primitive dataype byte canNOT hold 950 as it is out of its range

        short year; // In this line, we JUST DECLARED the variables
        year = 2023; // assigned a value

        int addressNumber = 234235435;

        long bigNumber;
        bigNumber = 6465654646464465464L; //with long, if number is too big we have to add l or L to the end of it

        //even if you use a different datatype, you still cant use the same variable name more than once
    }
}

