package day20_nested_loops;

import java.util.Scanner;

public class BasePower {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("enter number 1:");
            int num1 = scan.nextInt();

            System.out.println("enter number 2:");
            int num2 = scan.nextInt();

            int result = 1;

            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }

            System.out.println(result);
    }
}
