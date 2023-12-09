package day45_a_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {

        Consumer <Integer> printToN = n -> {
            for (int i = 0; i <= n; i++) {
                System.out.println(i + " ");
            }
        };

        printToN.accept(5);

        System.out.println("================");
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Winter", "Holiday"));
        list.forEach(each -> System.out.println(each));

        list.forEach(each -> System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1)));

        list.forEach(each -> {
            if (each.length()>6)
                System.out.println(each);
        });


    }
}
