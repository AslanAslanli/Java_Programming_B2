package day25_methods;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your birth year?");
        int birthYear = scan.nextInt();
        if (birthYear > 2023 || birthYear<1900)
            System.out.println("invalid birth year");
        else
            System.out.println(calcAge(birthYear));

    }
    public static int calcAge(int birthYear){
        int age = 2023-birthYear;
        return age;
    }
}
