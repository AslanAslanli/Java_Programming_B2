package day19_nested_loops;
import java.util.Scanner;
public class BiggestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "aaabbbcccddddeeeee";
        //            0123456789.......
        String sub = "";
        String biggest = "";

        for (int i = 0; i < str.length()-1; i++) {

            sub += str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1)) {

//                if (i == str.length()-2) {
//                    if (biggest.contains("" + str.charAt(str.length()-1))) {
//                        biggest += str.charAt(str.length()-1);
//                    }
//                }

                if (biggest.length() < sub.length()) {
                    biggest = sub;
                }

                sub = "";
            }

        }
        System.out.println(biggest);


/*
Task 1 - BiggestSubstring

    Create a class called BiggestSubstring in your Practice_Programming project and inside the day18_tasks package

        Task:
                    Biggest substring of matching characters

                    Given a String find the biggest substring of chars that match and print it.

                    Ex: aaabbbcccccddddee
                    Output: ccccc
 */

    }
}
