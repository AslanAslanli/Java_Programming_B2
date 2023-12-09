package day42_maps.collection;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));


        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add(null);
        linkedList.add("a");
        System.out.println(linkedList);
        System.out.println(linkedList.get(3));

        List<String> vectorList = new Vector<>();
        vectorList.add("a");
        vectorList.add("b");
        vectorList.add("c");
        vectorList.add("d");
        vectorList.add(null);
        vectorList.add("a");
        System.out.println(vectorList);
        System.out.println(vectorList.get(3));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(14);
        set.add(2);
        set.add(-5);
        set.add(4);
        System.out.println(set);

        for (Integer each : set) {
            if (each == 10) {
                System.out.println(each);
            }
        }
        //Collections.sort(Arrays.asList(set);
        Set<Integer> setSorted = new TreeSet<>(set);
        System.out.println(setSorted);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(10);
        list4.add(14);
        list4.add(2);
        list4.add(-5);
        list4.add(4);
        System.out.println(list4);

        Set<Integer> set2 = new HashSet<>(list4);
        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(list4);
        System.out.println(set3);

        System.out.println(new ArrayList<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));
        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));

        String s = "aaaabbbccccccccddddeee";
        System.out.println(Arrays.toString(s.split("")));

        System.out.println(Arrays.asList(s.split("")));

        System.out.println(new HashSet<>(Arrays.asList(s.split(""))));
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", "")
        );


    }
}
