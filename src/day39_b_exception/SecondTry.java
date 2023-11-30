package day39_b_exception;

public class SecondTry {
    public static void main(String[] args) {

        try {
            String s = "java";
            //s = null;
            System.out.println(s.length());

            int [] nums = {2, 43, 56, 2};
            System.out.println(nums[7]);

        }/* catch (Exception e){
            System.out.println("Parent exception");
        }*/ catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an Array index out of Bonds exception");
        }

        /*
        try {
            String s = "java";
            //s = null;
            System.out.println(s.length());

            try {int [] nums = {2, 43, 56, 2};
            System.out.println(nums[7]);}
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an Array index out of Bonds exception");
            }

        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception");
        }
         */



    }
}
