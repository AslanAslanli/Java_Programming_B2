package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main (String [] args){

        int n = 20;
        System.out.println(n > 5); // true
        System.out.println(n < 10); // false

        System.out.println(n > 5 && n < 10); // false
        System.out.println(n > 5 || n < 10); // true

        System.out.println(4 > 3 && 5 > 3 || false); // true
        System.out.println(4 > 3 && 5 > 3 || false); //

        System.out.println(!false);
        System.out.println(!true);

        System.out.println(4 != 4);

        System.out.println(4 > 3 || false || 4 > 3 || false);



    }
}
