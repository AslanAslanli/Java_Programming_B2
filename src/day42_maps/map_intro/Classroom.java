package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();

        Student studentOne = new Student("Tom", 25, 234);
        map.put(1, studentOne);

        //System.out.println(map.get(1));

        map.put(2, new Student("Mickie", 26, 556));
        map.put(3, new Student("Winnie", 30, 999));
        map.put(4, new Student("James", 45, 777));

        System.out.println(map);
        System.out.println(map.get(3).name);

        System.out.println(map.keySet());

        for (Integer each : map.keySet()) {
            if (map.get(each).id == 777)
                System.out.println(map.get(each));
        }

        for (Student each : map.values()) {
            if (each.id == 777)
                System.out.println(each);
        }

        for (Map.Entry <Integer, Student> each : map.entrySet()) {
            System.out.println("Each Key: " + each.getKey());
            System.out.println("Each Value: " + each.getValue());
        }




    }
}
