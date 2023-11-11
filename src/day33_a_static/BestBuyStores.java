package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("Fairfax");
        BestBuy store2 = new BestBuy("McLean");
        BestBuy store3 = new BestBuy("Falls Church");

        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println();
        System.out.println(store1.headQuarter);
        System.out.println(store2.headQuarter);
        System.out.println(store3.headQuarter);

        System.out.println();
        store1.headQuarter = "Texas, US";
        System.out.println(store1.headQuarter);
        System.out.println(store2.headQuarter);
        System.out.println(store3.headQuarter);

        System.out.println(BestBuy.headQuarter);

        System.out.println();
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);
        System.out.println(store3.day);

        System.out.println();
        BestBuy.day = "Sunday";
        BestBuy.day = "Weekday";
        System.out.println(BestBuy.day);


        store1.openStore();
        store2.openStore();
        store3.openStore();

        store1.countStock();
        BestBuy.countStock();


    }





}
