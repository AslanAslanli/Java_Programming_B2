package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = scan.nextLine().trim();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == ' ') {
                str = str.substring(0, str.indexOf(i)) + str.substring(i + 1, str.length());
            }
            else if (str.charAt(i) == ' '){
            count++;
            }
        }
        System.out.println(count+1);

    }
}
