package day20_nested_loops;
import java.util.Scanner;
public class SumOddSumEvenInputs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumOdd = 0;
        int sumEven = 0;

        boolean addNum;
        do {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0)
                sumEven += num;
            else
                sumOdd += num;

            scan.nextLine();
            System.out.println("want to add more numbers?");
            addNum = scan.nextLine().equalsIgnoreCase("yes");

        } while (addNum);

        System.out.println("sumOdd = " + sumOdd);
        System.out.println("sumEven = " + sumEven);


    }







}
