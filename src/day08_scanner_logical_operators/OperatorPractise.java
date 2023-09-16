package day08_scanner_logical_operators;

public class OperatorPractise {
    public static void main (String [] args){

        int w = 78/2*2 + 3 - 5%5;
        System.out.println("w = " + w);
        System.out.println("-------------------------------");

        int a = 8;
        int b = a--; // b = 8 | after this line a = 7
        int c = a++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("-------------------------------");

        int l = 50;
        int p = --l + l++ + l-- + l++;
        System.out.println("l = " + l);
        System.out.println("p = " + p);
        System.out.println("-------------------------------");

        int r = 20;
        int k = -r-- + r++ + --r*r--%2;
        System.out.println("r = " + r);
        System.out.println("k = " + k);


    }

}
