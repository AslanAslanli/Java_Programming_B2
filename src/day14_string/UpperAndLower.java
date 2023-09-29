package day14_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "LooPCamP";

        System.out.println(str);
        System.out.println(str.toLowerCase()); //this will convert string value to lower case

        str = str.toLowerCase();
        System.out.println(str);

        str = "LoopCamP";
        System.out.println(str.toUpperCase()); //this will convert string value to upper case
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("------------------------");

        String word = "HELLO";
        String word2 = word + " WORLD";
        System.out.println(word2);
        System.out.println(word);

        System.out.println(word.toUpperCase());
        System.out.println(word2.toLowerCase());
        System.out.println(word.toLowerCase());

        System.out.println(word2);
        System.out.println(word);

        word2 += " Next Line";
        System.out.println(word2); // HELLO WORLD Next Line

        word2 = word2.toLowerCase();
        System.out.println(word2); // hello world next line




    }
}
