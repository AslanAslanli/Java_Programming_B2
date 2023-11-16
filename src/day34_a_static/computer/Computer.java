package day34_a_static.computer;

public class Computer {

    // access modifier is default for instance vars
    String brand, color;
    double price;

    static boolean hasScreen, hasBattery, hasMemory;

    static {
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void test(){
        System.out.println("Brand: " + brand);
        System.out.println("Memory: " + hasMemory);
    }

}
