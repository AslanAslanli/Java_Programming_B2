package day45_a_stream.functions;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction <Integer, Integer, Integer> maxNumber = (num1, num2) -> {
            return num1>num2 ? num1 : num2;
        };

        System.out.println(maxNumber.apply(4, 12));

        System.out.println("-------------");
        BiFunction <List<Integer>, List <String>, Map<Integer, String>> generateMap = (firstPart, secondPart) -> {

            Map <Integer, String> map = new HashMap<>();

            for (int i = 0; i < firstPart.size(); i++) {
                map.put(firstPart.get(i), secondPart.get(i));
            }

            return map;
        };

        List<Integer> firstPart = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> secondPart = new ArrayList<>(Arrays.asList("Iryna", "Valentina", "Gular", "Zahid"));

        System.out.println(generateMap.apply(firstPart, secondPart));

    }
}
