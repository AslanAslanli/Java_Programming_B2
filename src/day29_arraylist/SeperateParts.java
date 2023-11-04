package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperateParts {
    public static void main(String[] args) {

        String s = "";
        s.toCharArray();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);
        //ArrayList<Character> list1 = new ArrayList<>(Arrays.asList(s.toCharArray()));

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(list);
        special.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "="));
        System.out.println(special);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(special);
        System.out.println(letters);


    }
}
