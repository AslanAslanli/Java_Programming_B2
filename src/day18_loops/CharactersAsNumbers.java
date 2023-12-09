package day18_loops;

import java.util.Scanner;

public class CharactersAsNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i) + " ");
        }


    }
}
