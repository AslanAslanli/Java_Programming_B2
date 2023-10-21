package day24_methods;

public class AverageOfEach {
    public static void main(String[] args) {
        int [][] nums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 20, 30}};

        int sum = 0;
        int totalLength = 0;

        for (int[] eachArray : nums) {
            for (int eachElement : eachArray) {
                sum += eachElement;
            }
            totalLength += eachArray.length;
        }

        System.out.println(sum / totalLength);


    }
}
