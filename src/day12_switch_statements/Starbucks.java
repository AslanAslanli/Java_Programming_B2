package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which size drink do you want?");
        String drinkSize = input.nextLine();

        double price = 0.0;
        double calories = 0.0;

        switch (drinkSize){
            case "tall":
                price += 2.5;
                calories += 100;
                break;

            case "grande":
                price += 4.0;
                calories += 150;
                break;

            case "venti":
                price += 4.5;
                calories += 200;
                break;

            default:
                System.out.println("invalid input");
        }

        String message = drinkSize + " coffee is $" + price + " and it has " + calories + " calories";
        System.out.println(message);

    }
    /*
    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */
}
