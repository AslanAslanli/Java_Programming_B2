package day16_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int result = 1;

        while (i > 0) {
            result *= i;
            i--;
        } System.out.println(result);

    }
}
