package day38_a_abstraction_interface.interface_methods;

public interface Mac {
    String NAME = "Mac";
    String OS = "IOS";

    void turnOn();

    static void company(){

    }

    public default void facetime(){

    }

}
