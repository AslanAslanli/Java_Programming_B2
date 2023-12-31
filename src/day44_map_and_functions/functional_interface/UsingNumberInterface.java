package day44_map_and_functions.functional_interface;

import day44_map_and_functions.functional_interface.NumberInterface;

public class UsingNumberInterface {
    public static void main(String[] args) {
        NumberInterface evenOrOdd = (n) ->{
            if (n%2 == 0)
                System.out.println(n + " is even");
            else
                System.out.println(n + " is odd");
        };

        evenOrOdd.apply(28);
        evenOrOdd.apply(23);

        NumberInterface cube = number -> {
            System.out.println(number*number*number);
        };

        cube.apply(3);
        cube.apply(5);
        //cube.apply("5");


    }
}
