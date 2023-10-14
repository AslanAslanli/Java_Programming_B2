package day21_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        String [] month = {"January", "February", "March",
                "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println(month.length); // 12
        System.out.println(Arrays.toString(month));

        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        if (userNum >= 1 && userNum <=12) {

            System.out.println(month[userNum-1]);

        } else {
            System.out.println("Sorry, invalid input");
        }






    }
}
