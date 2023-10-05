package day15_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a url");
        String url = input.next();// www.google.com
        //                           01234567890123

        String result = "" + url.charAt(4)+ url.charAt(5)+ url.charAt(6)+ url.charAt(7)+ url.charAt(8)+ url.charAt(9);
        System.out.println(result);

        // .subString(StartIndex)
        // .subString(startIndex, endIndex)

        int startPoint = url.indexOf(".") + 1;
        System.out.println(startPoint);
        System.out.println(url.substring(startPoint));

        int endPoint = url.charAt(url.length()-4);
        System.out.println(url.substring(startPoint, endPoint));



    }

}
