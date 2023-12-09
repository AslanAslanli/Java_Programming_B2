package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList <String> group = new ArrayList<>();
        System.out.println(group.size());

        group.add("Ulvi");
        group.add("Iryna");
        group.add("Majd");
        group.add("Oleksandr");
        group.add("Ievgenia");
        group.add("Aslan");

        System.out.println(group);
        System.out.println(group.size());

        System.out.println(group.get(0));
        System.out.println(group.get(1));
        System.out.println(group.get(2));
        System.out.println(group.get(3));
        System.out.println(group.get(4));
        System.out.println(group.get(5));

        for (int i = 0; i < group.size(); i++) {
            System.out.println((i+1) + " name: " + group.get(i));
        }

        for (String each : group) {
            System.out.println("Name: " + each);
        }

        for (String each : group) {
            for (int i = 0; i < each.length(); i++) {
                System.out.println(each.charAt(i));
            }
            System.out.println("----------");
        }

    }

}
