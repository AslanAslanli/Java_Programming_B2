package day20_nested_loops;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int counter;

        for (int i = 0; i < str.length(); i++) {

            counter = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }

            if (!str.substring(0, i).contains("" + str.charAt(i)))
                System.out.println(str.charAt(i) + " occurs " + counter + " times");

        }

    }
}
