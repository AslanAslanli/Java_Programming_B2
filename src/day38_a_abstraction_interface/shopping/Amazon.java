package day38_a_abstraction_interface.shopping;

public class Amazon extends OnlineShopping{
    @Override
    public void payForShipping(boolean b) {
        System.out.println(b?"pay for shipping":"Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }
}
