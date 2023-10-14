package day21_arrays;

public class AverageNum {
    public static void main(String[] args) {

        int [] nums = {2, 3, 45, 55};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int average = sum/nums.length;

        System.out.println(average);
    }
}
