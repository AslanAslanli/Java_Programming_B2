package day23_multiDimensional_arrays;

import java.util.Arrays;

public class EqualsSample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 3};

        System.out.println(a == b); // false

        System.out.println(Arrays.equals(a, b)); // true

        int[] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d)); // false

        Arrays.sort(d); // d = {1, 2, 3}
        System.out.println(Arrays.equals(a, d)); // true







    }
}
