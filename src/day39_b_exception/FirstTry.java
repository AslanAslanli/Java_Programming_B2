package day39_b_exception;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First Line");

        try {
            String word = "java";
            System.out.println(word.charAt(4));
        } catch (Exception e){
            System.out.println("Exception happened. check later");
        }



        System.out.println("Last Line");
    }
}
