package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browser: ");

        String browser = input.nextLine(); // in case we have multiple words

        System.out.println("Enter your URL: ");
        String url = input.nextLine();

        int n = 4;
        switch (browser){
            case "Chrome":
                System.out.println("opening " + url + " in the " + browser + " browser");
                System.out.println("Loading.....");
                break;
            case "Edge":
                System.out.println("opening " + url + " in the " + browser + " browser");
                System.out.println("Loading.....");
                switch (n) {
                    case 4:
                        System.out.println("open in " + n + " tabs");
                }
                break;
            case "Safari":
            case "SAFARI":
            case "SaFaRI":
            case "sAFARI":
                System.out.println("opening " + url + " in the " + browser + " browser");
                System.out.println("Loading.....");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }





    }
}
