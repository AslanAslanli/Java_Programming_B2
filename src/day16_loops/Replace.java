package day16_loops;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "java is a language";

        String first = str.substring(0,str.indexOf(" ")+1); //java
        String second = str.substring(str.indexOf(" ") + 1);
        //String last = str.substring(str.lastIndexOf("",str.length()));//

        System.out.println(first + second);
        System.out.println(second + " " + first);
    }
}
