package day20_nested_loops;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number to check for prime");
        int num = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num%i == 0)
                isPrime = false;
        }
        System.out.println(isPrime? "it is prime":"it is not prime");


    }
}
