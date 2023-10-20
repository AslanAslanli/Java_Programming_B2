package day23_multiDimensional_arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
/*
    Arrays.toString (arrName);
    Arrays.equals (arr1, arr2);
    Arrays.sort (arrName);
    Arrays.copyOf();

    String str = "java";
        str.toCharArray();
        str.split("sfs");
    String.join ("  ", str);

    String str = new String (arrName);
 */
        int[] a = {1, 2, 3};
        int[] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        a[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b)); // b is still the same with a. as it is a pointer
        System.out.println();

        int[] z = Arrays.copyOf(a, 3);









    }
}
