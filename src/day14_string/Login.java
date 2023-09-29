package day14_string;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter username pls");
        String username = scan.next();
        username = username.toLowerCase();


        System.out.println("enter password pls");
        String password = scan.next();
        password = password.toLowerCase();

        String actualPasswordInDB = "loopcamp2023";

        System.out.println();

        if (username.equals("java") && password.length()>8 && password.equals(actualPasswordInDB)){
            System.out.println("You are logged in");
        } else {
            if (!username.equals("java")){
                System.out.println("username is invalid");
            } else {
                System.out.println("invalid password");
            }
        }

         /*
        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "loopcamp"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password

     */
    }
}
