package day31_custom_classes;

import day25_methods.Car;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean isPersianX, double widthX,
                  double lengthX,
                   double unitPriceX){

        width = widthX;
        length = lengthX;
        isPersian = isPersianX;
        unitPrice = unitPriceX;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = width * length * unitPrice;

        if (isPersian)
            totalPrice += 200;
    }

    @Override
    public String toString() {
            return (isPersian? "The Persian Carpet: " : "The Carpet") +
                    "\n has dimensions: " + width + "*" +
                    "\n unitPrice: " + unitPrice +
                    "\n Total Price: " + totalPrice;


    }
}
