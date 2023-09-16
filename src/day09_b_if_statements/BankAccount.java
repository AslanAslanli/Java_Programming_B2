package day09_b_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        System.out.println("What si your balance? ");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();

        System.out.println("How much do you want to withdraw?");
        int withdraw = input.nextInt();

        balance -= withdraw;
        System.out.println("Remaining balance is: " + balance);

        if (balance < 0){
            System.out.println("You took out too much. You owe us: " + balance);
        } else {
            System.out.println("Your new balance is $" + balance);
        }

    }
}
