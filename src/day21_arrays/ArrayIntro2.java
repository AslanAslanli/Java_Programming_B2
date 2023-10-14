package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double [] arr = new double[4];  // there will be 4 element in this array
        System.out.println(arr.length); // 4
        System.out.println(Arrays.toString(arr));

        // How can I assign 30.99 to index 0
        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr)); // [30.99, 0.0, 0.0, 0.0]
        System.out.println(arr[0]); //

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 4;
        System.out.println(Arrays.toString(arr));
        // arr[4] = 45; // this will be error

        arr[2] = 200;
        System.out.println(Arrays.toString(arr));


        arr = new double[4]; // this creates a new array with 4 elements
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

        String [] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));

        // null and blankString is not the same

        char [] arr2 =  new char[] {1, 4, 5, 8};
        System.out.println(arr2.length); // 4







    }
}
