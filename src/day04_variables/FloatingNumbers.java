package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {

        // 0.75 --- we can not write like "int num = 3/4"
        float average = 0.4F; // similar to "long", we have to add a letter f or F to the end of the number
        double price = 3.99;

        int num = 3/4;
        System.out.println(num); // only the whole part will be printed out
        num = 5/4;
        System.out.println(num); // only the whole part will be printed out
        System.out.println(5/4); // only the whole part will be printed out

        int num1 = 20;
        int num2 = num1 +2;
        System.out.println(num2);
    }
}
