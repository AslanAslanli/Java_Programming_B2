package day11_if_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        String message = "";

        if (num%5 == 0 && num%3 == 0){
            message = "FizzBuzz";
        } else if (num%5 == 0){
            message = "Buzz";
        } else if (num%3 == 0) {
            message = "Fizz";
        } else {
            message = "" + num;
        }

        System.out.println(message);
        /*
            		Task: Evaulate your number and print based on the following:
          		multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
          		For numbers which are multiples of both three and five print “FizzBuzz”.
          		If the number is not disibile by any of those numbers print just the number

        	Example:

            		number = 5

            		"FizzBuzz" -> when number is divisible by 3 and  5
            		"Fizz" -> when number is divisible by 3
            		"Buzz" -> when number is divisible by 5
         */
    }
}
