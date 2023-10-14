package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

//        String [] studentOne = {"001", "Tom", "Jerry", "Batch#2"};
//        System.out.println(Arrays.toString(studentOne));
//
//        String [] studentTwo = new String[4];
//        System.out.println(Arrays.toString(studentTwo));
//        studentTwo[0] = "002";
//        studentTwo[1] = "Mickey";
//        studentTwo[2] = "Mouse";
//        studentTwo[3] = "Batch#2";
//        System.out.println(Arrays.toString(studentTwo));
//
//
        Scanner input = new Scanner(System.in);
//        String [] studentThree = new String[4];
//        System.out.println("enter ID: ");
//        studentThree[0] = input.next();
//        System.out.println("enter first name: ");
//        studentThree[1] = input.next();
//        System.out.println("enter last name: ");
//        studentThree[2] = input.next();
//        System.out.println("enter batch number: ");
//        studentThree[3] = input.next();
//
//        System.out.println(Arrays.toString(studentThree));

        String [] questions = {"Enter ID: ", "Enter name: ", "Enter last name: ", "Enter batch number: "};
        String [] studentFour = new String[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println( questions[i] );
            studentFour[i] = input.next();
        }

        System.out.println(Arrays.toString(studentFour));
    }
}
