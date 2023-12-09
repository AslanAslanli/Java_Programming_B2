package day31_custom_classes;

public class TrafficLight {
    String light;
    // we explicitly defined any constructor
    // thus the default constructor one will not be created
    // default constructor has no parameter

    public TrafficLight(String color) {
        light = color;
    }
}
