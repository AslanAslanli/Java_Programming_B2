package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));


    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {

        nums.removeIf(each -> Collections.frequency(nums, each)>1);

        return nums;
    }
}
