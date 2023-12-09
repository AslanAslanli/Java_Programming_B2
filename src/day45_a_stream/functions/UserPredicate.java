package day45_a_stream.functions;

import java.util.Arrays;
import java.util.function.Predicate;

public class UserPredicate {

    public static Predicate <String> isPalindrome = (str) -> {
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    };

    public static Predicate<Integer> isPrime = number -> {
        int count = 0;
        for (int i = 0; i <= number; i++) {
            if (number%i == 0)
                count++;
        }
        return count == 2;
    };












//    public static void main(String[] args) {
//        String str = new String("hello");
//        str.length();
//    }
}
