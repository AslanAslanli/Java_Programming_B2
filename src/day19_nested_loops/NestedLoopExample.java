package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int week = 0; week <= 4; week++) {
            System.out.println("Week: " + week);

            for (int day = 1 ; day <= 7; day++) {
                System.out.println("Day: " +day);
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int week = 0; week <= 4; week++) {
            System.out.println("Week: " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("Day: " +day);
            }
            System.out.println();
        }
    }
}
