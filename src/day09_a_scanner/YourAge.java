package day09_a_scanner;

import java.util.Scanner;

public class YourAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age pls: ");
        byte age = input.nextByte(); // "." (dot after input) is called "dot operator"

        System.out.println("enter your favourite number pls: ");
        long favNum = input.nextLong();

        System.out.println("Enter your fav book: ");
        String favBook = input.next();

        input.nextLong();
        System.out.println("Your age: " + age);
        System.out.println("Your favourite number: " + favNum);
        System.out.println("Your favourite book: " + favBook);}}
