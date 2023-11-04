package day30_a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumFromString(list));
    }

    public static ArrayList<Integer> sumFromString (ArrayList<String> list) {
        ArrayList<Integer> sumList = new ArrayList<>();

        for (String each : list) {
            int sum = 0;

            for (String eachDigit: each.split("")){
                sum += Integer.parseInt(eachDigit);
            }

//            for (int j = 0; j < each.length(); j++) {
//                sum += Integer.parseInt(each.charAt(j) + "");
//            }
            sumList.add(sum);
        }



        return sumList;
    }

}
