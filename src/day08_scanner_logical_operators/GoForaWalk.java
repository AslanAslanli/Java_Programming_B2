package day08_scanner_logical_operators;

public class GoForaWalk {
    public static void main(String[] args) {

        /*
        i wannna go walking if it is not raiing and temperature is above 70
         */
        boolean isRaining = false;
        double temp = 60;

        boolean goForAWalk;

        System.out.println("Do i need to go for a walk? " + (isRaining && temp > 70) );
    }
}
