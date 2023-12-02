package day42_maps.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ievgeia");
        names.add("Caglar");
        names.add("Aliksandr");
        names.add("Iryna");
        names.add("Eyad");

        System.out.println(names);
///////////////////////////////////////////////////////////////////////////////////
        Iterator<String> iterator = names.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //System.out.println(iterator.next()); // NoSuchAnElement exception

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<String> iterator2 = names.iterator();

    }
}
