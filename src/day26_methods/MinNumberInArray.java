package day26_methods;

import my_utilities.ArrayUtil;

public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5, -6, 9};
        System.out.println(ArrayUtil.minInArr(arr));
        System.out.println(ArrayUtil.maxInArray(arr));

    }
}
