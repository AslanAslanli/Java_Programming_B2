package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

public class ArrayIndexOF {
    public static void main(String[] args) {
        int[] arr = {12, 34, 4, 2, 23, 324, 345, 4, 64, 345};
        //            0   1  2  3   4   5    6   7   8
        System.out.println(ArrayUtil.indexOf(arr, 345));
        System.out.println(ArrayUtil.allIndexesOf(arr, 345));
    }




}
