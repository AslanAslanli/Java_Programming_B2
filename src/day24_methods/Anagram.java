package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("enter a word");
//        String word1 = scan.next();
//        System.out.println("enter another word");
//        String word2 = scan.next();

        String str1 = "loop";
        String str2 = "pool";

        System.out.println (str1.equals(str2));

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));








    }
}
