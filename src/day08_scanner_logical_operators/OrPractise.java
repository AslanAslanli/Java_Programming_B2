package day08_scanner_logical_operators;

public class OrPractise {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges <5); // true
        System.out.println(apples > 10 || oranges == 10); // true
        System.out.println(apples > 10 && oranges == 10); // false

        // Discount are available: On WEEKEND and TEACHER || DOCTOR

        System.out.println(false && apples++ > 4);
        System.out.println("apples = " + apples);

    }
}
