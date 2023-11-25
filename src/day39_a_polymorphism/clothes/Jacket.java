package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("wearing jacket");
    }
    @Override
    public void putOnHood() {
        System.out.println("putting on jacket hood");
    }
}
