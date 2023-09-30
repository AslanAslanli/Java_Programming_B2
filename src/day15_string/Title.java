package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter URL: ");
        String url = input.next().toLowerCase();

        System.out.println("Now enter your name with titles");
        String name = input.next();

        if (url.startsWith("www.") && url.endsWith(".com")){
            System.out.println(name + "entered correct url: " + url);
        } else {
            System.out.println("invalid url");
        }


    }
}
