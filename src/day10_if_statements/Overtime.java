package day10_if_statements;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        /*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked

        calculate your net pay, with consideration of overtime pay

            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */
       double hourlyRate, numOfHrs;
       double netPay;

        Scanner input = new Scanner(System.in);

        System.out.println("How many hours did you work last week?");
        numOfHrs = input.nextDouble();

        System.out.println("How much is your hourly rate?");
        hourlyRate = input.nextDouble();

        if (numOfHrs>40){
            netPay = 40*hourlyRate + (numOfHrs-40)*1.5*hourlyRate;
            System.out.println("Net pay = $" + netPay);
        } else {
        netPay = numOfHrs*hourlyRate;
        System.out.println("Your net pay is: $" + netPay);}

    }
}
