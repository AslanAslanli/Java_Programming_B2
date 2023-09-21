package day10_if_statements;

import java.util.Scanner;

public class CheckCharacters {
    public static void main(String[] args) {

//    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
//find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is
//    ex:
//        'b'
//        lowercase
//    ex:
//        'U'
//        uppercase
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a letter below: ");
        char letter = 'o';

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println("It is a capital letter");
        } else if (letter >= 'a' && letter <= 'z'){
            System.out.println("It is a lower letter");
        } else {
            System.out.println("Invalid character");
        }



    }
}
