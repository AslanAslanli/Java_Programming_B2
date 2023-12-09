package day18_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a sentence or word");
        String str = scan.nextLine();

        String reversed = "";

        for (int i = 1; i <= str.length(); i++) {
            reversed = "" + str.charAt(str.length() - i);
            System.out.print(reversed);
        }
    }
}
