package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println(list.size());

        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");
        list.add("desk");

        System.out.println(list);
        String str = list.remove(0); // computer. returns the remove object of the given index
        System.out.println(str);
        System.out.println(list);

        boolean b1 = list.remove("mouse"); // true
        System.out.println(b1); // true
        System.out.println(list);


    }
}
