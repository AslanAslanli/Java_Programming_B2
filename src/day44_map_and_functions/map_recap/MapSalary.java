package day44_map_and_functions.map_recap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap();

        map.put("Alina", 120_000.00);
        map.put("Sergii", 200_000.00);
        map.put("Anna", 150_000.00);
        map.put("Davyd", 210_000.00);
        map.put("Denys", 140_000.00);
        map.put("Ramiz", 290_000.00);

        String nameForHighest = "";
        double highestSalary = 0.0;

//        Double[] salaries = map.values().toArray(new Double[0]);
//        Arrays.sort(salaries);

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE;

        for ( String eachKEY: map.keySet()) {
            double value = map.get(eachKEY);

            if (value > highestSalary) {
                highestSalary = value;
                nameForHighest = eachKEY;
            }
            if (value < lowestSalary) {
                lowestSalary = value;
                nameForLowest = eachKEY;
            }
        }

        System.out.println("highestSalary = " + highestSalary);
        System.out.println("nameForHighest = " + nameForHighest);

        System.out.println("lowestSalary = " + lowestSalary);
        System.out.println("nameForLowest = " + nameForLowest);

        System.out.println("------------------------------");
        int counter = 0;

        for (Double eachValue : map.values()) {
            if (eachValue>=120_000 && eachValue<=200_000)
                counter++;
        }

        System.out.println("Number of the people making btw 120-200: " + counter);

    }
}


