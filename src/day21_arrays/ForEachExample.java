package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30, 12, 150, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional fori loop: " + nums[i]);
        }

        System.out.println();

        for (int each : nums) {
            System.out.println("For each loop: " + each);
            if (each == 12)
                break;
        }


        System.out.println("-------------------------------");
        String [] classes = {"java", "soft skills", "api", "db", "selenium"};

        // Traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional: " + classes[i]);
        }

        for (String each : classes) {
            System.out.println("For Each Loop: " + each);
        }

        System.out.println("-------------------");
        double [] prices = {2.3, 45.7, 34, 21.2};

        for (double each: prices) {
            System.out.println("Each: $" + each);
        }






    }

}
