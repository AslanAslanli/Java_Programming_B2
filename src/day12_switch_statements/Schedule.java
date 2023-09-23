package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day of week and what is it about? ");
        String day = input.next();
        String result = "";

        switch (day){
            case "Monday":
                result = "for now nothing. but soon extra mentor class";
                break;
            case "Tuesday": case "tue": case "tuesday":
            case "Friday": case "friday": case "Fri":
                result = "nothing for today. just practise java";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                result = "java day";
                break;
            case "Sunday":
                result = "funday, Nadir day";
                break;
            default:
                result = "invalid input";
                break;
        }

        System.out.println(result);


/*Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code
 */

    }
}
