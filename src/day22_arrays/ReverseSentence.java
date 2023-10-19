package day22_arrays;
import java.util.Arrays;
public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "today is java";

//     This is reversing by characters
//        String[] revStr = sentence.split("");
//
//        String output = "";
//
//        for (int i = revStr.length-1; i >= 0; i--) {
//            output += revStr[i];
//        }
//
//        System.out.println(output);
        String[] byWordRev = sentence.split(" ");
        String output = "";

        for (int i = byWordRev.length-1; i >= 0; i--) {
            output += byWordRev[i] + " ";
        }

        System.out.println(output.trim());

    }
}
