package day23_multiDimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int[] arr1 = {30, 90, 68, 360, 180};
        int[] arr2 = {180, 360, 30, 90, 68};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------");

        Arrays.sort(arr1);
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------");

        String[] words = {"2hello", "1java", "3Thursday"};

        System.out.println("Before sorting: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("After sorting: " + Arrays.toString(words));

        System.out.println();
        String[] words2 = {"hello", "java", "Thursday", " ", "23", "12"};
        Arrays.sort(words);
        System.out.println("After sorting: " + Arrays.toString(words2));



















    }
}
