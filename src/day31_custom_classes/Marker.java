package day31_custom_classes;

public class Marker {

    String type;
    String brand;

    @Override
    public String toString() {
        return "Marker" +
                "\n\ttype: " + type +
                "\n\tbrand: " + brand +
                "\n\tcolor: " + color;
    }

    String color;

    public Marker(String typeX, String brandX, String colorX) {
        type = typeX;
        brand = brandX;
        color = colorX;
    }
}
