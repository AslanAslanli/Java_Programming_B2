package day24_methods;

import java.util.Arrays;

public class MultiarrayExample {
    public static void main(String[] args) {

        int[] nums1 = {5, 10, 20, 10};
        int[] nums2 = {5, 10, 100, 39, 19};
        System.out.println(Arrays.toString(nums1));

        int[][] all = {nums1, nums2};
        System.out.println(Arrays.deepToString(all));

        System.out.println("First Array in 2D array: " + Arrays.toString(all[0]));
        System.out.println("First Array in 2D array: " + Arrays.toString(all[1]));

        System.out.println();
        int [][] multi = {
                        {90, 30, 20},
                        {23, 12, 15, 456, 567, 34, 23},
                        {23, 3425},
                        {14}    };

        System.out.println(multi.length);                // 4
        System.out.println(multi[0].length);             // 3
        System.out.println(multi[0][1]);                 // 30
        System.out.println(Arrays.deepToString(multi));  // entire 2D array
        System.out.println(multi[3].length);             // 1
        System.out.println(multi[3][0]);                 // 14





    }
}
