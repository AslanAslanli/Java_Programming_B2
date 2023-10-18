package day20_nested_loops;
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to be reversed");
        int num = scan.nextInt();
        int num2 = num;

        int reversed = 0;
        String reversedStr = "";

        while (num>0) {
            reversedStr += num%10;
            num = num/10;
        }

        for (int i = num2; i > 0; i/=10) {
            reversed = reversed*10 + num2%10;
            num2 = num2/10;
        }

        System.out.println("int reversed = " + reversed);
        System.out.println("String reversed = " + reversedStr);


    }
}
