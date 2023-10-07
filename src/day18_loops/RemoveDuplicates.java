package day18_loops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String original = "abcabc";
        String unique = "";

        for (int i = 0; i < original.length(); i++) {
            if (!unique.contains("" + original.charAt(i)));
            unique += original.charAt(i);
        }
        System.out.println("original = " + original);
        System.out.println("unique = " + unique);
    }
}
