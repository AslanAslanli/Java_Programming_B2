package day08_scanner_logical_operators;

public class SignType {
    public static void main(String[] args) {
         /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */
        double num = 52.364;
        boolean isNumPositive = num > 0;
        boolean isNumNegative = num < 0;
        boolean isNumZero = num == 0;
        boolean isNotZero = num != 0;


        System.out.println("Number is positive: " + isNumPositive);
        System.out.println("Number is negative: " + isNumNegative);
        System.out.println("Number is zero: " + isNumZero);
        System.out.println("Number is not zero: " + isNotZero);

    }
}
