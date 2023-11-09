package day31_custom_classes;

import java.util.Scanner;

public class UseMarker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Marker marker1 = new Marker("Dry Erase", "Expo", "Black");
        System.out.println(marker1);

        Marker marker2 = new Marker("Wide", "Sharpie", "Green");
        System.out.println(marker2);

        System.out.println("Please enter variables for marker 3");
        Marker marker3 = new Marker(scan.next(), scan.next(), scan.next());
        System.out.println(marker3);
//        marker3.type = "Narrow";
//        marker3.brand = "Uni";
//        marker3.color = "Yellow";

    }
}
