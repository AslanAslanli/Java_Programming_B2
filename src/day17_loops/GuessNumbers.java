package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNum = 77;
        int guessedNumber;

        do {
            System.out.println("Enter your guess from 1-100:");
            guessedNumber = input.nextInt();

            if (guessedNumber>secretNum) System.out.println("too high");
            if (guessedNumber<secretNum) System.out.println("too low");

        } while (guessedNumber != secretNum);

        System.out.println("Your guess it correct");


    }
}
