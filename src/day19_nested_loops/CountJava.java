package day19_nested_loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to check for \"java\" ");
        String str = scan.nextLine();
        //String str = "java is a language java java java daaa";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).contains("java")) {
                counter++;
                str = str.substring(0, str.indexOf("java")) + str.substring(str.indexOf("java")+4);
            }
        }
        System.out.println(counter);

    }
}
