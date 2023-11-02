package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);
        nums.add(100);

        System.out.println(nums.indexOf(100)); // first matching element index

        System.out.println(nums.indexOf(700));

        int ind = nums.indexOf(200);
        System.out.println(ind);

        System.out.println(nums.lastIndexOf(100));  // 5
        System.out.println(nums.lastIndexOf(5000)); // -1

        System.out.println( nums.get(nums.size() - 1) );

        nums.set(nums.indexOf(100), 0);
        System.out.println(nums);

        nums.set(nums.indexOf(100), 0);
        System.out.println(nums);

        nums.set(nums.indexOf(100), 0); // nums.set(-1, 0);
        System.out.println(nums);


    }
}
