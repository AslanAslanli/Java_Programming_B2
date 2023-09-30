package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);

        System.out.println("First character is: " + first);
        System.out.println("Last character is: " + last);

    }
}
