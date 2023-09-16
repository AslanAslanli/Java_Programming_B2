package day08_scanner_logical_operators;

public class Speeding {
    public static void main (String [] args){

        double currentSpeed = 51, speedLimit = 40;
        boolean isSpeeding = currentSpeed > (speedLimit + 10);

        System.out.println("Are you speeding? " + isSpeeding);

    }
}
