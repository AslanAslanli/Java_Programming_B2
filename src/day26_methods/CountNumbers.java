package day26_methods;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a num to sum");
//        int num = input.nextInt();
        System.out.println("Sum is: " + sumNumbers(5*2));

    }

    public static int sumNumbers(int x) {
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }


}
