package day23_multiDimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
/*
    Arrays.toString (arrName);
    Arrays.equals (arr1, arr2);
    Arrays.sort (arrName);

    String str = "java";
        str.toCharArray();
        str.split("sfs");

    String str = new String (arrName);
 */

        String[] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        // Output: a-b-c
        String result = "";
        for (String each : words) {
            result += each + "-";
        }
        System.out.println(result.substring(0, result.length() - 1));
        /////////////////////////////////////////////

        String str = String.join("-", words);
        System.out.println(str);

        char[] arr = {'a', 'b', 'c', 'd'};
        String str1 = new String(arr);
        System.out.println(str1);

        String[] words1 = {" ", " ", " "};
        String str2 = String.join("-", words1);
        System.out.println(str2);


        System.out.println(String.join("-", words[0], words1[2]));



    }
}
