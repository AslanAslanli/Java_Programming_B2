package day19_nested_loops;
import java.util.Scanner;
public class NestedLoopExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Universe");

            for (int j = 1; j <= 5 ; j++) {
                System.out.println("Hello World");
            }
            System.out.println();
        }


    }
}
