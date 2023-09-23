package day10_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Which month would you like to check? ");
//        byte mnth = input.nextByte();
//
//        if (mnth==1||mnth==3||mnth==5||mnth==7||mnth==10||mnth==11){
//            System.out.println("31 days");
//        } else if (mnth==4||mnth==6||mnth==9||mnth==11) {
//            System.out.println("30 days");
//        } else if (mnth==28){
//            System.out.println("28 days");
//        } else {
//            System.out.println("invalid number");
//        }

        int num = 5;

        if (num > 1){
            System.out.println("hi1");
        } else if (num>2) {
            System.out.println("hi2");
        } else {
            System.out.println("hi3");
        }

            if (num>1) {System.out.println("hi4");}
            if (num>2) {System.out.println("hi5");}
    }

}
