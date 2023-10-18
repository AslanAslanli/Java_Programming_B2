package day20_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i%j == 0)
                    isPrime = false;
            }

            if (isPrime)
                System.out.print(i + " ");
        }



    }
}
