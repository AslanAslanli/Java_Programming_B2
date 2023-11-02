package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3}; //
        System.out.println(Arrays.toString(arr));

        Arrays.asList(arr);
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

        ArrayList <Integer> nums2 = new ArrayList<>(Arrays.asList(12, 23, 4, 5, 6));
        System.out.println(nums2);




    }
}
