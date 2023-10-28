package my_utilities;

import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println("Fixed format of your entered string is: " + fixFormat(str));
        System.out.println("Camel case of your entered string is: " + camelCase(str));
        System.out.println("Frequency of char 'a' in your string is: " + frequencyOfChar(str, 'a'));
        System.out.println("List of unique chars is: " + uniqueCharacters(str));
        System.out.println("List of duplicate chars is: " + duplicateChars(str));
    }

    /**
     * this method takes a string and returns it with pascal case
     */
    public static String fixFormat (String str) {
        str = str.toLowerCase();
        str = str.substring(0,1).toUpperCase() + str.substring(1);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                str = str.substring(0, i+1) + str.substring(i+1, i+2).toUpperCase() + str.substring(i+2);
        }
        return str;
    }

    public static String camelCase (String str) {
        str = str.toLowerCase().trim();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                str = str.substring(0,i) + str.toUpperCase().charAt(i+1) + str.substring(i+2);
        }
        return str;
    }

    public static int frequencyOfChar (String str, char letter) {
        int charCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                charCounter++;
        }
        return charCounter;
    }

    public static String uniqueCharacters (String str) {
        String uniqueChars = "";
        for (int i = 0; i < str.length() ; i++) {
            if (frequencyOfChar(str, str.charAt(i)) == 1) {
                uniqueChars += str.charAt(i);
            }
        }
        return uniqueChars;
    }

    public static String duplicateChars (String str) {
        String dupChars = "";

        for (int i = 0; i < str.length() ; i++) {
            if (frequencyOfChar(str, str.charAt(i)) > 1) {
                dupChars += str.charAt(i);
                str = str.replaceAll(""+str.charAt(i), "");
            }
        }
        return dupChars;
    }

    public static boolean isPalindrome(String word) {

        return true;
    }
}
