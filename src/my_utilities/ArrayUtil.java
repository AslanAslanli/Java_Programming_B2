package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int [] arr = {2, 6, 5, 8, 25, 224, -96, 0};
        System.out.println("Smallest in your array is: " + minInArr(arr));
        System.out.println("Biggest in your array is: " + maxInArray(arr));
        System.out.println("Does your array contain 5?: " + containsInArr(arr, 5));
        System.out.println("-9 added to your array. Your new array is: " + Arrays.toString(addToArray(arr, -9)));
    }
    public static int minInArr (int [] arr) {
        int min = arr [0];

        for (int each : arr) {
            if (each < min)
                min = each;
        }
        return min;
    }
    public static int maxInArray (int [] arr) {
        int max = arr [0];
        for (int each : arr) {
            if (each > max)
                max = each;
        }
        return max;
    }
    public static boolean containsInArr (int [] arr, int x) {
        boolean contains = false;
        for (int each : arr) {
            if (each == x) {
                contains = true;
                break;
            }
        }
        return contains;
    }
    public static int[] addToArray (int [] arr, int x) {
        int[] addedArray = Arrays.copyOf(arr, arr.length+1);
        addedArray [addedArray.length-1] = x;
        return addedArray;
    }

    public static int sumOfArray(int ... arr){
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static boolean isInTheArray(int[] arr, int num) {
        for (int each : arr) {
            if (each == num){
                return true;
            }
        }
        return false;
    }
    public static int indexOf (int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
    public static String allIndexesOf (int[] arr, int num) {
        String str = "";
        boolean hasNum = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                str += i + " ";
                hasNum = true;
            }
        }
        return hasNum? str : "-1";
    }
    public static int indexOf (String[] str, String word) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(word))
                return i;
        }
        return -1;
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
}
