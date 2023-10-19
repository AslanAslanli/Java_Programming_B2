package day22_arrays;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3, 5, 7, 3243, 8, 23, 23};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int min = nums[0];
        int max = nums [nums.length-1];

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
