package day41_collections.recap_try_catch;

import java.util.ArrayList;

public class RecapTryCatch {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");

        System.out.println(list.get(1));
        try {
            System.out.println(list.get(2));

            String s = null;
            s = s.toLowerCase();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(list);

        System.out.println();
        System.out.println("start");

        try {
            Thread.sleep(-2000);
        } catch (InterruptedException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
