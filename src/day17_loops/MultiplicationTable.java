package day17_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i*num));
        }
    }
}
