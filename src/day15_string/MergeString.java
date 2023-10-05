package day15_string;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "abc";
        String b = "xyz";
        //ax by cz

        String merged = "";

        merged += a.charAt(0);
        merged += b.charAt(b.length()-1);

        merged += a.charAt(1);
        merged += b.charAt(b.length()-2);

        merged += a.charAt(2);
        merged += b.charAt(b.length()-3);

        System.out.println(merged);

    }
}
