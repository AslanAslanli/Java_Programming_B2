package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first angle please: ");
        double angle1 = input.nextDouble();
        System.out.println("Enter the second angle please: ");
        double angle2 = input.nextDouble();
        System.out.println("Enter the third angle please: ");
        double angle3 = input.nextDouble();

        boolean isTriangle = angle1+angle2+angle3 == 180;
        boolean isCircle = angle1+angle2+angle3 == 360;

        System.out.println("Is Triangle? " + isTriangle);
        System.out.println("Is Circle? " + isCircle);

    }
}
