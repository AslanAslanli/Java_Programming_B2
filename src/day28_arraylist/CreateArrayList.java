package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList <String> listOne = new ArrayList<>(Arrays.asList("hello", "bye"));

        System.out.println(listOne);

        ArrayList <String> listTwo = new ArrayList<>(listOne);
        System.out.println(listTwo);

        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("hello", "bye", "three"));
        System.out.println(listThree);

        listThree.set(listThree.size() - 1, listThree.get(listThree.size() - 1).toUpperCase());
        System.out.println(listThree.get(listThree.size() - 1));

    }
}
