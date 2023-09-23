package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {
        /* - The person must be a citizen or a resident
            -> If not print: You must be a citizen or a resident
        - Their age must be between 18 and 35
            -> If not print: Your age must be between 18 to 35 years old
        - They must have a high school diploma
            -> If not print: You must have a high school diploma

        > If all the criteria is met print: You are qualified for the Army
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you a citizen? true/false: ");
        boolean isCitizenship = scan.hasNextBoolean();

        System.out.println("Are you a resident? true/false: ");
        boolean isResident = scan.hasNextBoolean();

        System.out.println("Do you have a diploma? true/false");
        boolean hasDiploma = scan.hasNextBoolean();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        String message = "";

        if (isCitizenship || isResident) {
            message = "You passed first qualification";

            if (age >= 18 && age <= 35) {
                message += "\nYou passed age requirement";

                if (hasDiploma) {
                    message += "You passed diploma requirement";
                } else {
                    message += "You must have a high school diploma";
                }
            }
            else {
                message += "Your age must be between 18 to 35 years old";}


        } else {
            message = "You must be a citizen or resident";
        }

        System.out.println(message);
    }
}

