package day04_variables;

public class Fruits {
    public static void main(String[] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

       // int apples = 50, grapes = 100, bananas = 150;
        // ---> we can declare multiple variables of the same dataType like this

        System.out.println("This is how many apples we have " + apples);
        // + sign here is not an addition. it is called CONCATINATION
        System.out.println("This is how amny grapes we have " + grapes);
        System.out.println("This is how amny bananas we have " + bananas);

        System.out.println("I sold some apples - 20 apples sold");
        apples = apples - 20;
        System.out.println(apples);

        int price = 150;
        System.out.println("The price of my 30 apples is 150");
        System.out.println("The price of my " + apples + " apple is " + price);

        System.out.println(apples);
        System.out.println(50 + 100);
    }
}
