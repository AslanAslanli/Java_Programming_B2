package day17_loops;
import java.util.Scanner;
public class ForLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1;  i <= 10;  i++) {
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("--------------");
        }
////////////////////////////////////////////////////////
        int z = 1;
        while (z <= 10){
            System.out.println(z);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("--------------");
            z++;
        }
//////////////////////////////////////////////////////
        int k = 1;
        do {
            System.out.println(k);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("--------------");
            k++;
        } while (k <= 10);

    }
}
