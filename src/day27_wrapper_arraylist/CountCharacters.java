package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "sef23LENF#$234sdf";
        int countUpper = 0;
        int countLower = 0;
        int countOthers = 0;
        int countDigit = 0;

        for (int i = 0; i < str.length(); i++) {
           char eachLetter = str.charAt(i);

           if (Character.isUpperCase(eachLetter))
               countUpper++;
           else if (Character.isLowerCase(eachLetter))
                countLower++;
           else if (Character.isDigit(eachLetter))
               countDigit++;
           else
               countOthers++;
        }
        System.out.println("countUpper = " + countUpper);
        System.out.println("countLower = " + countLower);
        System.out.println("countOthers = " + countOthers);
        System.out.println("countDigit = " + countDigit);
    }
}
