package day34_a_static.computer;

public class Computer_Lab {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Computer comp1 = new Computer("HP", "Silver", 600);
        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);

        System.out.println(comp1.brand);
        System.out.println(comp1.color);

        System.out.println(comp1.hasBattery);




    }
}
