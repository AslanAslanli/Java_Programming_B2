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
}
