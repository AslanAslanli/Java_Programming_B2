package day04_variables;

public class PrintDate {
    public static void main (String [] args){

            int month = 9,
                    day = 06, //if you start your number with 0, it wont print
                    year = 2023;
        System.out.println("month/day/year " + month + "/" + day + "/" + year);
        System.out.println("month/day/year " + month + "." + day + "." + year); // dot
        System.out.println("month/day/year " + month + "-" + day + "-" + year); // hyphen
        System.out.println("month/day/year " + month + "|" + day + "|" + year); // vertical bar


    }
}
