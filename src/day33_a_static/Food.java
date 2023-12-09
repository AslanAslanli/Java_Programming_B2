package day33_a_static;

import java.util.Collection;

public class Food  {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculateTotal();
    }

    public Food(String name, int quantity, double unitPrice, double totalPrice) {
        this(name, quantity, unitPrice);
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() {
        totalPrice = quantity*unitPrice;
    }

    @Override
    public String toString() {
        return "Food " +
                " name: " + name +
                ", quantity: " + quantity +
                ", unitPrice: " + unitPrice +
                ", totalPrice: " + totalPrice;
    }
}
