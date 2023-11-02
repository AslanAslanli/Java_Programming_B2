package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("water");
        list.add("bread");
        list.add("apple");
        list.add("butter");

        System.out.println(list);

        list.add(1, "cherry");
        System.out.println(list);
        System.out.println(list.get(list.size()-1));

        System.out.println("-----------");
        list.remove(0);
        System.out.println(list);

        list.remove(list.size()-1);
        System.out.println(list);

        list.remove("bread");
        System.out.println(list);

        list.remove("asfs");
        System.out.println(list.remove("asfs")); // false
        System.out.println(list);

        System.out.println(list.remove("apple")); // true
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);


    }
}
