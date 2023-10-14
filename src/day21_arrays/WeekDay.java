package day21_arrays;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        String [] weekDays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        while (userNum < 1 || userNum > 7) {
            System.out.println("enter a num in 1-7 range");
            userNum = input.nextInt();
        }

        System.out.println(weekDays[userNum - 1]);

    }
}
