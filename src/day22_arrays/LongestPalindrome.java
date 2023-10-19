package day22_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrome = "";

        for (int i = 0; i < arr.length; i++) {
            String eachWord = arr[i];
            String reversed = "";

            for (int j = eachWord.length()-1; j >= 0; j++) {
                reversed += "" + eachWord.charAt(j);
            }

            if (reversed.equals(eachWord) && eachWord.length() > longestPalindrome.length()) {
                    longestPalindrome = eachWord;
            }
        }

        System.out.println(longestPalindrome);


    }
}


/*
String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        //String [] arr = {"abc", "dna", "kevin", "joe", "lamp"};
        String [] palArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String checkPal = "";
            for (int j = arr[i].length()-1; j >= arr[i].length()/2; j--) {
                checkPal += arr[i].charAt(j);
            }
            palArr [i] = arr[i].startsWith(checkPal)? arr[i] : " ";ar
        }

        Arrays.sort(palArr);
        System.out.println(palArr[palArr.length - 1].equals(" ")? "No palindrome in the given array":"Longest palindrome is: " + palArr[palArr.length - 1]);


 */