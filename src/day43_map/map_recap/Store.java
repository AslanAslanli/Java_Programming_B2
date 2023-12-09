package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();

        store.put("Water", 1.9);
        store.put("Coffee", 2.9);
        store.put("Apples", 0.99);
        store.put("Bread", 3.99);
        store.put("Banana", 1.99);

        System.out.println(store.get("Water"));
        System.out.println(store.values());

        for (String each : store.keySet()) {
            System.out.println(each);
            System.out.println(store.get(each));
        }

        System.out.println(store.keySet());
        System.out.println();
        Set<String> list = new HashSet<>(store.keySet());

        System.out.println(store.values());
        for (Double each : store.values()) {
            System.out.println(each);
        }
        Scanner scan = new Scanner(System.in);
        for ( Map.Entry<String, Double> each : store.entrySet()) {
            System.out.println("Item name: " + each.getKey());
            System.out.println("Value of " + each.getKey() + " is $ " + each.getValue());
        }

        System.out.println("Item name: " + store.get(scan.next()));



        Map<String, Double> map1 = new HashMap<>();
        Map<String, Double> map2 = new HashMap<>();
        Map<String, Double> map3 = new HashMap<>();

        Map<Integer, Map<String, Double>> allMaps = new HashMap<>();



    }

    public String  keyFinder( Map<String, Double> store, double value) {
        for (String each : store.keySet()) {
            if (store.get(each) == value)
                return each;
        }
        return null;
    }
}
