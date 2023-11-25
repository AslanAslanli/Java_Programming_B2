package day39_a_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        TShirt tShirt1 = new TShirt();
        tShirt1.wear();

        Clothes tShirt2 = new TShirt();
        tShirt2.wear();

        Object tShirt3 = new TShirt();
        //tShirt3.wear();
////////////////////////////////////////////////////////////////
        Jacket jacket1 = new Jacket();

        Clothes jacket2 = new Jacket();
        jacket2.wear();

        HasHood jacket3 = new Jacket();
        jacket3.putOnHood();

        buy(tShirt1);
        buy(jacket1);

    }

    public static void buy(Clothes clothes){
        if (clothes instanceof TShirt)
            System.out.println("Bought TShirt");
        if (clothes instanceof TShirt)
            System.out.println("Bought Jacket");
    }



}
