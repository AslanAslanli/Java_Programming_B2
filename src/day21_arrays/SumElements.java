package day21_arrays;
import java.util.Scanner;
public class SumElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] nums = {3, 5, 7, 8};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println(sum);


    }
}
