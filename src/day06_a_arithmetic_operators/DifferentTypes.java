package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        //both of below is int
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println();

        //one side is double and another side is int --> double and int = double
        System.out.println(10.0 / 5);   // double
        System.out.println(10.0 / 5.0); // double

        System.out.println( 10.0/5);
        System.out.println((int) 10.0/5.0);
        System.out.println();
        System.out.println((int) 10.0/5);

        byte b1 = 10;
        byte b2 = 20;

        //byte sum = b1 + b2; // This will work

    }
}
