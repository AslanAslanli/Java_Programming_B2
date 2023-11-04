package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(removeLongString(list, 4));

    }

    public static ArrayList<String> removeLongString(ArrayList<String> list, int maxLength) {
        ArrayList<String> updatedList = new ArrayList<>(list);

//        for (String each : list) {
//            if (each.length()>=maxLength)
//                updatedList.add(each);
//        }

        updatedList.removeIf(each -> each.length()<maxLength);

        return updatedList;
    }
}
