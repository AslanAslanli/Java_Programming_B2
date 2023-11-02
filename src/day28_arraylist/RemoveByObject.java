package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(10);
        nums.add(600);
        nums.add(700);
        nums.add(800);
        nums.add(900);
        nums.add(4000);
        nums.add(10);

        //nums.remove(0);
        System.out.println(nums);

//        Integer int1 = 10;
//        nums.remove(int1);

        nums.remove(Integer.valueOf(10));
        System.out.println(nums);

//        nums.remove(200);   // errorrrrr
//        System.out.println(nums);

        Integer i = 200;
        nums.remove(i);
        System.out.println(nums);

        nums.remove((Integer)300);
        System.out.println(nums);


    }
}
