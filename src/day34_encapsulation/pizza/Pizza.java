package day34_encapsulation.pizza;

import java.util.Locale;

public class Pizza {

   private String size;
   private int numOfToppings;

    public Pizza(String size, int numOfToppings) {
        this.size = size;
        this.numOfToppings = numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings>=0) this.numOfToppings = numOfToppings;
        else System.out.println("Wrong num of toppings");
    }

    public void setSize(String size) {
        switch (size) {
            case "Large":
            case "Medium":
            case "Small":
                this.size = size;
                break;
            default:
                System.out.println("Error: Wrong Size");
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfToppings=" + numOfToppings +
                '}';
    }
}
