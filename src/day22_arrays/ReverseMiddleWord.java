package day22_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str = "Java always fun";

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String reversedMiddle = "";

        for (int i = words[1].length()-1; i >= 0; i--) {
            reversedMiddle += words[1].charAt(i);
        }

        words[1] = reversedMiddle;
        System.out.println(Arrays.toString(words));

    }
}
