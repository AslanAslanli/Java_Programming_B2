package day23_multiDimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many elements do you want to have in an array");
        int size = input.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value for index " + i);
            arr[i] = input.nextInt();
        }

        System.out.println("Array so far: " + Arrays.toString(arr));

//        int[] arr2 = Arrays.copyOf(arr, arr.length+1);
//        arr2[arr2.length-1] = 100;
//        System.out.println("New array with addition: " + Arrays.toString(arr2));

        System.out.println("how many new elements do you want to add?");

        int size3 = input.nextInt();
        int[] arr3 = Arrays.copyOf(arr, arr.length+size3);

        for (int i = arr.length; i < arr3.length; i++) {
            arr3[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr3));


    }
}
