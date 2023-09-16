package day07_relational_operators;

public class OperatorPractise4 {
    public static void main(String[] args) {

        int t = 100;

        int p = - ++t * -t-- / t++ + --t;
        // p = -101* -100 / 100 + 100

        double c  =10201.02 % 100;
        System.out.println("c = " + c);
    }
}
