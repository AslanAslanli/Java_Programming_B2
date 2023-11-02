package day27_wrapper_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {

        String year = "2023";

        int year1 = 2023;
        Integer year2 = 2023;
        Integer year3 = year1;

        System.out.println("Current year: " + year1);
        System.out.println("Next year: " + (year1 + 1));

        System.out.println("-------------");
        int numYear = Integer.parseInt(year);
        System.out.println("Current year: " + numYear);
        System.out.println("Next year: " + (numYear + 1));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String response = input.nextLine();

        String ageStr = response.split(" ")[2];
        int age = Integer.parseInt(ageStr);

        System.out.println("you will be " + (age+5) + " five years from now on");




    }
}
