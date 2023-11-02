package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 123, 234};
        int[] arr1 = {12, 35};
        System.out.println(Arrays.toString(combineArrays(arr, arr1)));
//        String[] arr1 = {"a", "b", "c"};
//        System.out.println(Arrays.toString(addElementsInArray(arr, 7, 8, 10, 12)));
//        System.out.println(Arrays.toString(addElementsInArray(arr1, "f", "g")));
    }

    public static int[] addElementsInArray (int[] arr, int ... nums ) {
        int[] addedArr = Arrays.copyOf(arr, arr.length+nums.length);
        int j = 0;
        for (int i = arr.length; i < addedArr.length; i++) {
            addedArr [i] = nums[j];
            j++;
        }
        return addedArr;
    }

    public static String[] addElementsInArray (String[] arr, String ... nums ) {
        String[] addedArr = new String[arr.length + nums.length];
        int j = 0;
        for (int i = arr.length; i < addedArr.length; i++) {
            addedArr [i] = nums[j];
            j++;
        }
        return addedArr;
    }

    public static int[] combineArrays(int[] arr1, int[] arr2){
        int[] combined = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int j = 0;
        for (int i = arr1.length; i < combined.length; i++) {
            combined [i] = arr2[j];
            j++;
        }
        return combined;
    }
}
