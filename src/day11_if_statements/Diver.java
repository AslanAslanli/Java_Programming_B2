package day11_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your O2 level below please: ");
        int o2Level = input.nextInt();

        String message = "";
        if (o2Level > 90) {
            message = "Your tank is full";
        } else if (o2Level > 80) {
            message = "Still ok";
        } else if (o2Level > 70) {
            message = "Dont go too far";
        } else if (o2Level > 60) {
            message = "Start to head back";
        } else if (o2Level > 50) {
            message = "Be carefull now you are at 50%";
        } else {
            message = "You were a good guy";
        }

        System.out.println(message);

        System.out.println("----------------");
        //// below multi-if is not logical!

//        if (o2Level > 50) {
//            System.out.println("Your tank is full");
//        } else if (o2Level > 60) {
//            System.out.println("Still ok");
//        } else if (o2Level > 70) {
//            System.out.println("Dont go too far");
//        } else if (o2Level > 80) {
//            System.out.println("Start to head back");
//        } else if (o2Level > 90) {
//            System.out.println("Be carefull now you are at 50%");
//        } else {
//            System.out.println("You were a good guy");
//        }




    }
}
