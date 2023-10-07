package day18_loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "java is a java language.java";
        int countJava = 0;

        while (str.contains("java")) {
            str = str.replaceFirst("java", "");
            countJava++;
        }
        System.out.println(countJava);


    }
}
