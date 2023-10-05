package day16_loops;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        if (str.length()%2 == 0) {
            System.out.println("" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2));
            System.out.println(str.substring(str.length()/2-1,str.length()/2+1));
        } else {
            System.out.println(str.charAt(str.length()/2));
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
        }
    }
}
