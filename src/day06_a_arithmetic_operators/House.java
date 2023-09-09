package day06_a_arithmetic_operators;

public class House {
    public static void main (String [] args){
        String house = "Single House";
        byte numberOfBedrooms = 5;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean isOnSale = false;
        double price = 999_999_9.99; // java avoids underscore in numbers
        String address = "123 Central Park";
        int zipcode = 516321;
        boolean hasPark = true;
        double rating = 0.9;

        String result = "The " + house + " on: \n\t" + address + ", " + zipcode;
        System.out.println(result);

    }
}
