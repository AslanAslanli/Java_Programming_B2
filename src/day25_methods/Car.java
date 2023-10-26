package day25_methods;
import java.util.Scanner;
public class Car {


    public static void unlockCar() {
        System.out.println("Unlocking the car");
    }
    public static void openDoor() {
        System.out.println("Openning the door");
    }
    public static void sitInCar() {
        System.out.println("Sitting in the car");
        System.out.println("Closing the car");
    }
    public static void getReadyToGo() {
        System.out.println("Putting on seatbelt");
        System.out.println("Put into drive mode");
        System.out.println("Check mirrors");
        System.out.println("Put music on");
        System.out.println("Put the navigation on");
    }
    public static void startCar() {
        System.out.println("Starting the car");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        unlockCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();
    }
    public static void driveInRush(){
        unlockCar();
        openDoor();
        sitInCar();
        startCar();
        getReadyToGo();
    }

}
