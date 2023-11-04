package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drinks.size());
        System.out.println(drinks);

        ArrayList<String> drink2 = new ArrayList<>(drinks);
        System.out.println(drink2);

        String[] allDrinks = {"cola", "monster", "red bull", "sarikiz"};
        ArrayList<String> drink3 = new ArrayList<>(Arrays.asList(allDrinks));
        //ArrayList<String> drink4 = new ArrayList<>(allDrinks); // not ok. arraylist does not accept array. it only takes collection type

        ArrayList<String> drink5 = new ArrayList<>(Arrays.asList("water", "dovga", "ayran"));
        System.out.println(drink5);

        drinks.addAll(Arrays.asList("water", "su", "voda"));
        System.out.println(drinks);

        drinks.addAll(0, Arrays.asList("ev kompotu"));


    }
}
