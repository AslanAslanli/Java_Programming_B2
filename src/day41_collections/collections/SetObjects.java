package day41_collections.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");

        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello");
        set2.add("%");

        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        //set3.add(null);
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello");
        set3.add("%");
        set3.add("World");

        System.out.println(set3);



    }
}
