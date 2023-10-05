package day16_loops;

import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = "java is a language";
        System.out.println(s);

        s = s.replace('a', 'e');
        System.out.println(s);

        s = s.replace('g', 'h');
        System.out.println(s);

        System.out.println("----------------------------");
        String day = "Today is Wednesday, we will learn java on Wednesday. It is Wednesday";
        System.out.println(day);
        day = day.replace("Wednesday", "Thursday");
        System.out.println(day);

        System.out.println("----------------------");
        String msg = "Today is Wednesday, we will elarn java on Wednesday, It is Wednesday";
        msg = msg.replace("Wednesday,", "Thursday");
        System.out.println(msg);

        msg = "Today is Wednesday, we will learn java on Wednesday. It is Wednesday";

        msg = msg.replaceFirst("Wednesday", "Saturday"); //only first wednesday replaced
        System.out.println(msg);

        msg = msg.replace("Saturday", "Thursday");
        System.out.println(msg);


    }
}
