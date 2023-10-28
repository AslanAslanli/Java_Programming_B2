package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size()+1);

        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-200);
        System.out.println(numbers);

        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));


    }
}
