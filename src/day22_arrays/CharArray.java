package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
//        char [] arr = {'j', 'a', 'v', 'a'};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        String word = "java";
//
//        char [] newArr = new char[word.length()];
//
//        for (int i = 0; i < word.length(); i++) {
//            newArr [i] = word.charAt(i);
//        }
//
//        char[] charArr = word.toCharArray();
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(charArr));
//
//        for (char everyElement : charArr) {
//            System.out.println(everyElement);
//        }
//
//        System.out.println(charArr[0]);
//
//        Arrays.toString(charArr);
//        System.out.println(charArr);


        char [] day = {'w', 'e', 'd', 'n', 'e', 's', 'd', 'a', 'y'};
        String allTogether = "";

        // this is one way of converting Array to String
        String str2 = day.toString().toLowerCase();
        System.out.println(str2);

        String str3 = new String(day);
        System.out.println(str3);


    }
}
