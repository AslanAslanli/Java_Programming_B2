package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Enter a number for language you want to use\n1 - English\n2 - Spanish\n3 - Turkish\n4 - " +
                "Russian\n5 - French\n6 - Azerbaijani");
        Scanner input = new Scanner(System.in);
        int numLang = input.nextInt();

        String message = "";
        if (numLang == 1) {
            message = "Hello, thanks for your call";
        } else if (numLang == 2){
            message = "Hola, como estas ";
        } else if (numLang == 3) {
            message = "Merhaba kankito";
        } else if (numLang == 4) {
            message = "Zdrasti bratishka";
        } else if (numLang == 5) {
            message = "Bonjur misyo";
        } else if (numLang == 6) {
            message = "Qaqam necesen";
        } else {

        }

        System.out.println(message);

    }
}
