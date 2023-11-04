package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovedCountries {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "United Kingdom", "Canada"));
        System.out.println(RemoveLongString.removeLongString(list, 7));
    }

    public static ArrayList<String> removeCountries (ArrayList<String> list) {
        ArrayList<String> updateCountries = new ArrayList<>(list);

        updateCountries.removeIf(ujuju -> ujuju.length()<7);

        return updateCountries;
    }

}
