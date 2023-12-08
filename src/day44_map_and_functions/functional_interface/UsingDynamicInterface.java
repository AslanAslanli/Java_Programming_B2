package day44_map_and_functions.functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface <String> printEachChar = (word) -> {
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };

        printEachChar.test("Hello Functional Interface");

//        DynamicInterface <Integer> printEachChar2 = (number) -> {
//            for (int i = 0; i < number; i++) {
//
//            }
//
//        };
    }
}
