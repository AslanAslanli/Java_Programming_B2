package day21_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {25, 6, 65, 786, 23, 67, 7886};
        int min = nums [0];
        int max = nums [0];

        for (int i = 0; i < nums.length; i++) {
            if (nums [i] >= max)
                max = nums[i];
            else if (nums [i] <= min)
                min = nums[i];
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
