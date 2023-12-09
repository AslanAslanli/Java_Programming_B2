package day45_a_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        list.stream();

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8));
        System.out.println("distinct method applied: " + list2.stream().distinct());

        System.out.println("Distinct applied anc converted to Collection" + list2.stream().distinct().collect(Collectors.toList()));

        System.out.println(list2);

        int[] arr2 = {1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8};
        System.out.println(  Arrays.toString(Arrays.stream(arr2).distinct().toArray()));

        System.out.println("----------------");

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(4).toArray()));




    }
    // streams work with data structures Array and Collection


}
