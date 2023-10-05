package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 3 String inputs");

        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();

        int num1 = str1.length();
        int num2 = str2.length();
        int num3 = str3.length();

        String message = "";

        if (num1 >= num2 && num1 >= num3) {
            if (str1.contains("a")) {
                message = str1 + " is the longest word that contains a";
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (str2.contains("a")) {
                message = str2 + " is the longest word that contains a";
            }
        } else if (num3 >= num1 && num3 >= num2){
            if (str3.contains("a")){
                    message = str3 + " is the longest word that contains a";}
            }
//        } else {
//                message = "none of the words contain a";
//            }
//            System.out.println(message);

        }}


