package day09_b_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry? Enter: true/false");
        boolean isHungry = input.nextBoolean();

        if (isHungry){
            System.out.println("I will get you something food to eat");
        } else {
            System.out.println("Great, then practise Java");
        }
    }

}
