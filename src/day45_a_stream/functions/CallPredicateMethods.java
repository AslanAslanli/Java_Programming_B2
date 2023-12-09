package day45_a_stream.functions;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean result = UserPredicate.isPalindrome.test("anna");
        System.out.println(result);

        //UserPredicate.isPalindrome.test("")


    }

}
