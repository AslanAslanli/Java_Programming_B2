package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println ("Enter the price please: $");
      double price = input.nextDouble();
      System.out.println("Enter the quantity please: ");
      int quantity = input.nextInt();

//      double revenue = price*quantity;
//      System.out.println("revenue = $" + String.format("%.2f", revenue));

      System.out.println("revenue = $" + String.format("%.2f", price*quantity));

    }
}
