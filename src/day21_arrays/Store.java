package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter an array length");
        int arrLength = scan.nextInt();

        String [] str = new String[arrLength];

        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter an item ");
            str [i] = scan.next();
        }

        System.out.println(Arrays.toString(str).toLowerCase().contains("jackets")? "we have it":"we dont have it");
//boolean hasJacket = false;
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equalsIgnoreCase("jackets")) {
//                hasJacket = true;
//                break;
//            }
//        }
//        System.out.println(hasJacket? "we have it": "we dont have it");


    }
}
