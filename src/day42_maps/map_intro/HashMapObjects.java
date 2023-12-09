package day42_maps.map_intro;

import java.util.*;

public class HashMapObjects {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 400);
        System.out.println(map);


        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(3, "three");
        map2.put(10, "ten");
        map2.put(5, "five");
        //map2.put(null, "hello");
        System.out.println(map2); // random order

        System.out.println(map2.get(10));

        System.out.println(map2.get(5));
        //System.out.println(value);
        map2.remove(1);
        System.out.println(map2);


        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsKey(3));

        map2.containsValue("five");
        map2.containsValue("Five");

//        map2.put(null, null);
//        System.out.println(map2);
//
//        map2.put(null, "Hello World!");
//        System.out.println(map2);

        map2.put(5, "May");
        System.out.println(map2);

        map2.put(7, "May");
        System.out.println(map2);

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map2);
        System.out.println(sortedMap);


    }
}
