package day23_multiDimensional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums ={4, 10, 30, 20, 100};

        // only works with sorted
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 10));
        System.out.println(Arrays.binarySearch(nums, 30));
        System.out.println(Arrays.binarySearch(nums, 20));
        System.out.println(Arrays.binarySearch(nums, 50));
        System.out.println(Arrays.binarySearch(nums, 100));









    }
}
