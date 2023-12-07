package day43_map.map_recap;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Map<String, Integer> counter = new HashMap<>();

        String word = "apple";
        char[] arr = word.toCharArray();
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(arr));

        //ArrayList<String> list = new ArrayList<>(Arrays.asList(word.split("")));

        for (String each : list) {
            counter.put(each, Collections.frequency(list, each));
        }

        System.out.println(counter);

//        for (int i = 0; i < word.length(); i++) {
//
//            Character eachChar = word.charAt(i);
//
//            if (counter.containsKey(eachChar))
//                counter.put(eachChar, counter.get(eachChar) + 1);
//            else
//                counter.put(eachChar, 1);
//        }



    }
}
