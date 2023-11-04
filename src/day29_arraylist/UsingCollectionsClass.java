package day29_arraylist;
import java.util.*;


public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12));
        System.out.println("Original: " + list);

        Collections.sort(list);
        System.out.println("Sortd: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters, 0, 3);
        System.out.println(letters);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 2, 34, 5, 7, 11));
        System.out.println(Collections.frequency(letters, 11));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(Collections.frequency(words, "one3"));


    }



}
