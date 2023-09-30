package day15_string;

import java.util.Scanner;
/*

 */
public class IndexOfMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "definition";
        //            0123456789

        System.out.println("first i index: " + str.indexOf("i"));
        System.out.println("last i index: " + str.lastIndexOf("i"));
        System.out.println("last i index: " + str.lastIndexOf('i')); // can also be done with char

        // how to find the 2nd i index
        System.out.println("Second i index: " + str.indexOf("i", 4));
    }
}
