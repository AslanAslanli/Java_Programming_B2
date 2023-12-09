package day28_arraylist;

import java.util.concurrent.atomic.AtomicReference;

public class HTMLGenerator {
    public static void main(String[] args) {
        System.out.println(htmlGenerator("div^3"));
        System.out.println(htmlGenerator("script^6"));


    }

    public static String htmlGenerator(String str) {
        String[] arr = str.split("\\^");
        String output = "";
        for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
            output += "<" + arr[0] + "></" + arr[0] + "> ";
        }
        return output;
    }
}
