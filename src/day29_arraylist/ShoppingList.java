package day29_arraylist;

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        statusOfShoppingList(shoppingList);

        askToAddItems(shoppingList);

        showListItem(shoppingList);

        System.out.println("List has item? " + hasItem(shoppingList));
        removeItem(shoppingList, 2);

        showListItem(shoppingList);


    }

    public static void removeItem(ArrayList<String> list, int index) {
        Scanner input = new Scanner(System.in);
        index = input.nextInt();
        if (index >=0 && index < list.size())
            list.remove(index);
        else
            System.out.println("Index is out of range");
    }

    public static boolean hasItem (ArrayList<String> list) {
       Scanner input = new Scanner(System.in);
       System.out.println("which item do you wanna check? ");
       return list.contains(input.nextLine());
    }

    public static void showListItem(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t " + (i+1) + list.get(i));
        }
    }

    public static void statusOfShoppingList (ArrayList<String> list){
        System.out.println(list.isEmpty()? "Shopping List is Empty" : "List Has items");
    }

    public static void askToAddItems(ArrayList<String> list){
        Scanner input = new Scanner(System.in);
        String userDecision = "";
        do {
            System.out.println("Enter the item: ");
            list.add(input.nextLine());

            System.out.println("Do you wanna add more y/n");
            userDecision = input.nextLine(); // y, Yes

        } while (userDecision.equals("y") || userDecision.equalsIgnoreCase("yes"));
    }

    public static ArrayList<String> addItems (ArrayList<String> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many items do you wanna add?");
        int itemsNum = input.nextInt();

        ArrayList<String> addedList = new ArrayList<>();

        for (int i = 0; i < itemsNum; i++) {
            addedList.add(input.nextLine());
        }

        return addedList;
    }
}
