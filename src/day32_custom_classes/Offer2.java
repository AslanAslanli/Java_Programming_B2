package day32_custom_classes;

public class Offer2 {

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location);
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;

    }


    public String toString(){
        return company + " located in " + location + "\npays $" + salary + " and provides " + numberOfPTO + " number of PTO" +
                ". This is a full time position " + isFullTime;
    }



}
