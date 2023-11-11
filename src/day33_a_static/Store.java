package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        Food f1 = new Food("Apples");
        Food f2 = new Food("Grapes");
//        System.out.println(f1);
//        System.out.println();
//        System.out.println(f2);
        Food f3 = new Food("Banana", 10, 0.99);
        Food f4 = new Food("Chips", 5, 1.99);
        Food f5 = new Food("Chicken", 2, 3.99);

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.addAll(Arrays.asList(f1, f2, f3, f4, f5));
        System.out.println(foodList);

//        for (Food each : foodList) {
//            System.out.println(each);
//        }
//
//        System.out.println();
//        for (Food each : foodList) {
//            if (each.quantity > 5){
//                System.out.println(each);
//            }
//        }

        ArrayList<Food> foodPriceNotZero = new ArrayList<>(foodList);
        foodPriceNotZero.removeIf(each -> each.unitPrice == 0);
        System.out.println();

        for (Food each : foodPriceNotZero) {
            System.out.println(each);
        }






    }
}
