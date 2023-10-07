package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;
        int i = 1;

        System.out.println("Welcome to ATM. Enter your pin: ");
        do {

            System.out.println("Enter your pin");
            userPin = input.nextInt();
            i++;

        } while (i<=3 && userPin != validPin);

        if (userPin == validPin) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Logged out");

        }


    }
}
