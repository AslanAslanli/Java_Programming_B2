package day18_loops;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message to check");
        String str =  scan.nextLine();
        
        int countLowercase = 0;
        int countUppercase = 0;
        int countNumber = 0;
        int countOtherChars = 0;

        for (int i = 0; i < str.length(); i++) {

            if ((int)str.charAt(i) >= 'a' && (int)str.charAt(i)<= 'z')
                countLowercase++;
            else if ((int)str.charAt(i) >= 'A' && (int)str.charAt(i)<= 'Z')
                countUppercase++;
            else if ((int)str.charAt(i) >= '0' && (int)str.charAt(i)<= '9')
                countNumber++;
            else
                countOtherChars++;
        }

        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countUppercase = " + countUppercase);
        System.out.println("countNumber = " + countNumber);
        System.out.println("countOtherChars = " + countOtherChars);

        System.out.println("///////////////////////////////////////////////");
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i)))
                countLowercase++;
            else if (Character.isUpperCase(str.charAt(i)))
                countUppercase++;
            else if (Character.isDigit(str.charAt(i)))
                countNumber++;
            else
                countOtherChars++;
        }
        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countUppercase = " + countUppercase);
        System.out.println("countNumber = " + countNumber);
        System.out.println("countOtherChars = " + countOtherChars);










    }
}
