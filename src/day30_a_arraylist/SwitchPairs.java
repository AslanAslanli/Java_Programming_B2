package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        System.out.println(switchPair(list));
    }

    public static ArrayList<String> switchPair (ArrayList<String> list) {

        for (int i = 0; i < list.size(); i+=2) {
            String str1 = list.get(i+1);
            list.set(i+1, list.get(i));
            list.set(i, str1);
        }
         //   Collections.swap(list, i, i+1);

        return list;
    }
}
