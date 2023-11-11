package day33_a_static;

public class Iphone {

    String model;
    double price;
    static String company = "Apple";
    static String os;
    static boolean appleDay;
    static String day;

    // Static block runs once, before anything
    static  {
        System.out.println("Running Static");
        company = "Apple";
        day = "Friday";
        os = "IOS";

        if (day.equals("Friday"))
            appleDay = true;
    }

    public Iphone(String model, double price) {
        System.out.println("Running Constructor");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone info: " +
                "\n\tmodel: " + model +
                "\n\tprice: " + price +
                "\n\tCompany: " + company;
    }
}
