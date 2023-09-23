package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {

        int n = 6; // number should be btw 1 and 5, inclusive

        //else if
        if (n == 1){
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("invalid number");
        }
        System.out.println("-------------------------------------------");
///////////////////////////////////////////////////////////////////////

        // n can only be String, char, short, byte, int
        // It will not work with boolean expression. We need EXACT values
        // n below can also be a number
        switch (n){
            case 1: // in if statement ---> if (n == 1)
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("invalid number");

        }


    }
}
