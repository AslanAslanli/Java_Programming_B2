package day45_a_stream.functions;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
public class BiConsumer {

    public static void main(String[] args) {

        java.util.function.BiConsumer <String, Integer> printNtimes = (str, num) -> {
            for (Integer i = 0; i < num; i++) {
                System.out.println(str);
            }
        };

        System.out.println("-----------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        map.forEach(
                (key, value) -> {
                    System.out.println(key + " " + value);
                }
        );

        map.forEach(
                (key, value) -> {
                    System.out.println("Size of the Key String" + key.length());
                }
        );

    }


    }

