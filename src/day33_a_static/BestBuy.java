package day33_a_static;

public class BestBuy {
    String location;
    static String headQuarter = "Minnesota, US";
    static String day = "Saturday";

    public BestBuy(String location) {
        this.location = location;
    }

    // Instance methods CAN NOT be called by class name. Only by obj name
    // Instance method can access both instance and static variables
    // Instance method can accept both types of methods
    public void openStore () {
        System.out.println("Opening " + location);
        System.out.println("Headquarter is " + headQuarter);
        countStock();
    }
    // Static method can only access static variables
    // Static method can be called by obj but always use class name
    // Static method only accepts static method
    public static void countStock () {
        // openStore();
        //System.out.println("Counting stock in " + location);
        System.out.println("Headquarter is " + headQuarter);
    }











}
