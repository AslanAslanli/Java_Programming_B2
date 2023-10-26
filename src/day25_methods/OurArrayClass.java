package day25_methods;

public class OurArrayClass {

    public static void firstElement(int[] nums){
        System.out.println(nums[0]);
    }
    public static void lastElement(int[] nums){
        System.out.println(nums[nums.length-1]);
    }
    public static void allElement(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void printMiddle(int [] nums){
        if (nums.length%2 == 0) {
            System.out.println("1st middle: " + nums[nums.length/2-1]);
            System.out.println("2nd middle: " + nums[nums.length/2]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {34, 1, 2, 3, 45, 56, 6, 873, 23};
        firstElement(numbers);
        lastElement(numbers);
        allElement(numbers);
    }
}
