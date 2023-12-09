package day26_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int num;

        do {
            num = scan.nextInt();
            System.out.println(numbersAsWords(num));
        } while (num < 1 || num > 10);
    }

    public static String numbersAsWords (int num) {
        String[] arr = {"Invalid entry. Digit has to be between 1-10. Please try again", "one",
                "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten"};
        String str;
        if (num>=1 && num<=10)
            str = arr[num];
        else
            str = arr[0];
        return str;
    }


//        int num;
//
//        do {
//            num = scan.nextInt();
//            System.out.println(numsToLetters(num));
//        } while (num < 0 || num > 9);
//    }
//
//    public static String numsToLetters (int x) {
//        String word;
//        switch (x) {
//            case 0: word = "zero"; break;
//            case 1: word = "one"; break;
//            case 2: word = "two"; break;
//            case 3: word = "three"; break;
//            case 4: word = "four"; break;
//            case 5: word = "five"; break;
//            case 6: word = "six"; break;
//            case 7: word = "seven"; break;
//            case 8: word = "eight"; break;
//            case 9: word = "nine"; break;
//            default: word = "Invalid entry. Digit has to be between 0-9. Please try again"; break;
//        }
//        return word;

}
