package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // With normal String decleration
        String cityOne = "Fairfax";
        String cityTwo = "Baku";
        String cityThree = "Houston";
        String cityFour = "Seattle";

        // With data Structure --- > Array
        String [] cities1 = {"Fairfax", "Baku", "Houston", "Seattle"};
        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour};
        // Indexes:             0         1          2          3

        System.out.println(cities2[0]);
        System.out.println(cities2[1]);
        System.out.println(cities2[2]);
        System.out.println(cities2[3]);

        System.out.println("All cities: " + cities2[0] + ", " + cities2[1] + ", " + cities2[2] + ", " + cities2[3]);

        // How to print an Array
        System.out.println(cities2); // this doesn't print the array. it just shows the hashcode
        System.out.println(Arrays.toString(cities2)); // this would print with [ ]

        // how to get the count of the elements in the array
        // similar to string we have a method for that. --- > String str = "loop"; --> str.length();
        System.out.println(cities2.length);
        System.out.println(cities2[1].substring(0, 2)); // first two letters of cities2[1] (Baku) ---> Ba

        System.out.println("" + Arrays.toString(cities2).charAt(0)); // [
        System.out.println(cities2[0] + " " + cities1[2]);














    }
}
