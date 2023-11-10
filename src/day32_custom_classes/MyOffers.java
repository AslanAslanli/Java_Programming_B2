package day32_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        Offer o1 = new Offer("Apple", "California", 100000, true, 30);
        Offer2 o2 = new Offer2("Samsung", "Seul", 100000, true, 30);

        System.out.println(o1);
        System.out.println();
        System.out.println(o2);

        System.out.println("-----------------------------------------------");

        ArrayList <String> list2 = new ArrayList<>();
        String str = new String("HelloWorld");
        list2.add(new String("hello"));
        list2.add(new String("bye"));
        list2.add(new String("loopcamp"));
        list2.add(str);
        System.out.println(list2);

        System.out.println();

        ArrayList <Offer2> offers = new ArrayList<>();
        offers.add(o2);
        System.out.println(offers);
        Offer2 a3 = new Offer2("Amazon", "Seattle", 20000, false, 30);
        offers.add(a3);
        System.out.println(offers);

        for (Offer2 each : offers) {
            System.out.println(each);
            System.out.println();
        }

        System.out.println("------------");
        String [] strArr = new String[4];
        strArr[0] = new String("loopcamp");
        System.out.println(Arrays.toString(strArr));

        System.out.println("**************************");
        Offer2 [] strArr2 = new Offer2[3];


    }
}
