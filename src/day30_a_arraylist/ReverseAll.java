package day30_a_arraylist;
import my_utilities.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(reverseAll(list));
    }
    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        ArrayList<String> reversed = new ArrayList<>();

        for (String each : list) {
            reversed.add(StringUtil.reverse(each));
        }

        return reversed;
    }


}
