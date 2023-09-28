package day13_string;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter number 1");
            int num1 = input.nextInt();
            System.out.println("Enter number 2");
            int num2 = input.nextInt();

        System.out.println("Pick operator: \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();
        int result = 0;
        String message = "";
        boolean runOrDont = true;

        switch (operator){
            case "+": case "plus":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                //System.out.println("invalid operator");
                message = "invalid operator";
                runOrDont = false;
        }

        if (runOrDont){
            System.out.println("You entered " + num1 + " and " + num2 +
                    "\nWith the " + " operator you selected the result is: " + result);
        } else {
            System.out.println(message);
        }

    }



}
