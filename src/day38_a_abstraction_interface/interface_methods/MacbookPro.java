package day38_a_abstraction_interface.interface_methods;

public class MacbookPro implements Mac {

    @Override
    public void turnOn() {
        System.out.println("Macbook is turning on");
    }
}

class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);

    }
}
