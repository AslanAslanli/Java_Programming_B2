package day16_loops;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);

        int num = 2;

        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }

        int i = 1;

        while (i <= 100) {
            if (i%2 != 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd:  " + i);
            }
            i++;
        }
    }
}
