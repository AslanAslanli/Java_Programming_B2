package day26_methods;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("apple", 'p'));
    }
    public static int frequencyOfChar (String str, char letter) {
        int charCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                charCounter++;
        }
        return charCounter;
    }
}


