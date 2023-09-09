package day06_unary_operators;

public class IncrementExample {
    public static void main (String [] args){

        int x = 0;
        System.out.println(x); // 0

        x = x + 1; // 1
        System.out.println(x);
        System.out.println(x);

        // In Java there is a shorter way to write "x + 1" in two options:
        // 1. POST-INCREMENT and 2. PRE-INCREMENT

        x++; // this will increase x value by 1 --> 1+1 = 2
        System.out.println(x);

        x++;
        System.out.println(x); // 3

        //PRE-INCREMENT
        ++x;
        System.out.println(x); // 4

        // Q: then what is the difference btw PRE and POST increment?
        System.out.println(++x); // 5

        System.out.println(x++); // still 5
        System.out.println(x); // 6



    }
}
