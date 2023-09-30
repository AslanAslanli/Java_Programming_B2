package day15_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name ");
        String fName = input.next();

        System.out.print("Enter your second name ");
        String sName = input.next();

        char i1 = fName.toUpperCase().charAt(0);
        char i2 = sName.toUpperCase().charAt(0);
        String initials = ""+i1+i2;

        System.out.println("Your initials are: " + initials);
    }
}
