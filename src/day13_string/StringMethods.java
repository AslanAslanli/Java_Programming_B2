package day13_string;

import java.util.Scanner;
import java.util.SplittableRandom;

public class StringMethods {
    public static void main(String[] args) {

        String str = "loopcamp";
        str = str + " is nice."; // here we made a completely new String

        String name = "Valentina";
        System.out.println(name == "Valentina"); //relational operator does not work with strings

        System.out.println(name.equals("Valentina")); //here we compare values not memory location
        System.out.println(name.equals("Parvana"));

        boolean result = name.equals("Loopcamp");
        System.out.println(result);

        System.out.println(name.equalsIgnoreCase("ValenTIna")); // valentina

        System.out.println("------------------------------");
        String a = new String ("hello");
        String b = new String("hello");

        System.out.println(a == b); // memory locations are compared as they were both made using "new" keyword. thus false
        System.out.println(a.equals(b)); //values are compared thus True
        System.out.println(a.length()); //number of characters in a


    }

}
