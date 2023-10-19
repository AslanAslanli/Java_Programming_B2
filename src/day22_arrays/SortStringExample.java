package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {"java", "api", "selenium", "database"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // alphabetic order sorting
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");
        String [] arr2 = {"java", "api", "Selenium", "34", "12", "database", "$", " "};
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2); //
        System.out.println(Arrays.toString(arr2));





    }
}
