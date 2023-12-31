package day31_custom_classes;
 /*
        Create a coffee class with these instance variables:
             price, size(oz), brand, types

             ex types: black, cappuccino, latte, mocchiato....

        instance methods:

            - make a toString to print all the information of the
            coffee objects

            - drink(): print: drinking $type of coffee

            - refill(amount in oz): print refilling x oz
                add the number of oz to the total size
     */

public class Coffee {

    double price;
    double size;
    String brand;
    String type;

    public String toString() {
        return type + " from " + brand + " size of " + size + " oz." +
                " For a total price $ " + price;
    }

    public void drink () {
        System.out.println("Drinking " + type + " of coffee");
        size -= 2;
    }
    public void refill (int oz) {
        if (size + oz <= 16) {
            System.out.println("Refilling..." + oz + " oz coffee");
            size += oz;
        }
        else
            System.out.println("you can not go over 16 oz");
    }

}

