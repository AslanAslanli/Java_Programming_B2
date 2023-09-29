package day14_string;

public class StartsAndEnds {
    public static void main(String[] args) {

        String str = "Apples";

        System.out.println(str.startsWith("App")); //true --> it checks if string value starts with the entered value in the method

        System.out.println(str.startsWith("app")); //false --> it checks if string value starts with the entered value in the method

        System.out.println(str.startsWith("Apple")); //true --> it checks if string value starts with the entered value in the method

        System.out.println(str.startsWith("Apples")); //true --> it checks if string value starts with the entered value in the method

        ///////////////////////////////////////////////

        String str2 = "App";
        System.out.println(str.startsWith(str2)); //true

        System.out.println("----------------------------------");
        System.out.println(str.startsWith(" App")); //false ---> due to space in the syntax
        System.out.println(str.startsWith(     "App")); //true ---> spaces are outside of syntax


        System.out.println("--------------------------------------");

        String sentence = "It is a good day";
        System.out.println(sentence.startsWith(" a good day")); // false
        System.out.println(sentence.endsWith(" a good day")); // true

        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith("d day")); // true
        System.out.println(sentence.endsWith("d day")); // true
        System.out.println(sentence.endsWith("It is a good day")); // true




















    }

}
