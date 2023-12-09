package day34_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {

        TrafficLights light = new TrafficLights("green");
        //light.color = "red";

        TrafficLights light2 = new TrafficLights("yellow");
        light.setColor("red");
        light2.setColor("pink");

        System.out.println();
        System.out.println(light.getColor());
        System.out.println(light2.getColor());










    }
}
