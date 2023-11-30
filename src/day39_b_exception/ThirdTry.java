package day39_b_exception;

import day08_scanner_logical_operators.ScannerIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;


        try{
            System.out.print("Enter number 1: ");
            num1 = input.nextInt();

            System.out.print("Enter number 2: ");
            num2 = input.nextInt();

            System.out.println("pikiTiki");
            System.out.println("num1/num2 is: " + num1/num2);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
            input.close();
        }

//        int x = input.nextInt();
//        System.out.println(x);


    }

}
