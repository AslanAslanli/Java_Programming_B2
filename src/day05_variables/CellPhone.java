package day05_variables;

public class CellPhone {
    public static void main (String [] args){

        String brand, model, color, price1, storage1;
        double price2 = 1000.99;
        int storage2 = 128;
        brand = "apple"; model = "iPhone 11pro"; color = "matt black"; price1 = "1000 $"; storage1 = "128 GB";
        boolean hasCamera = true; char sim = 'A';

        System.out.println(brand + ", " + model + ", " + color + ", " + price1 + ", " + price2 + ", " + storage2 + " ,"+ storage1 + ", " + hasCamera + ", " + sim);

        System.out.println("\nI have a " + model + " from " + brand + "\n" +
                            "It came in the color of " + color + " and it has a storage of " + storage1 + "\n" +
                            "For the sim type " + sim + " with a camera " + hasCamera + " the total price was " + price1 + "\n");
        //System.out.println();
        String fullMessage = "I have a " + model + " from " + brand + "\n" +
                "It came in the color of " + color + " and it has a storage of " + storage1 + "\n" +
                "For the sim type " + sim + " with a camera " + hasCamera + " the total price was " + price1;

        System.out.println(fullMessage);


    }
}
 /*
        create a class CellPhone
        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)

        Print all the variables

            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */