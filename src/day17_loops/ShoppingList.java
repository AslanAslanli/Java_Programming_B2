package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping List: ";
        String addMore = "";

        do {

            System.out.println("Enter the name of the item: ");
            String itemName = input.nextLine();
            list += "\n\t" + itemName;
            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        } while (addMore.equalsIgnoreCase("yes"));

        System.out.println(list);
    }
}
