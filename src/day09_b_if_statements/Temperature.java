package day09_b_if_statements;

import day07_relational_operators.SalaryCalculator;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = input.nextInt();

        if (temp >= 70){
            System.out.println("Go outside, but with your laptop to code Java");
        } else {
            System.out.println("It is too cold. Code more Java");
        }
    }
}
