package day09_a_scanner;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the day of the week today? ");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String name = input.next();

        System.out.println("Today: " + day);
        System.out.println("First name: " + name);

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        //input.nextLine();
        //System.out.println();
        System.out.println("Last name is " + lastName);
        System.out.println("Address is " + address);
    }
}
