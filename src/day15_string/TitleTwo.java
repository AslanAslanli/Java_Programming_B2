package day15_string;

import java.util.Scanner;

public class TitleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur name with title");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr.")||name.startsWith("mister")){
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms.")||name.startsWith("miss")||name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        } else {
            System.out.println("there is no title");
        }

        if (name.endsWith(" sr")){
            System.out.println("nice to meet you senior");
        } else if (name.endsWith(" jr")){
            System.out.println("nice to meet you junior");
        }
    }
}
