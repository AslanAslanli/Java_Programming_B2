package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        System.out.println("This is not tabbed");//This line is not tabbed
        System.out.println("\tThis is tabbed");//This line is tabbed 1 time
        System.out.println("    This is spaced 4 times");//Following line is spaces 4 times which equals to 1 tab
        System.out.println("\t\tThis line is double tabbed");//How to use double tab? - \t\t

        //The following is about NewLine
        System.out.println("1) Go to store");
        System.out.println("2) Grab milk");
        System.out.println("3) Pay at the cashier\n");

        System.out.println("1) Go to store\n2) Grab milk\n3) Pay at the cashier");

    /*    String sentence = "I like java programming";
        int number = 5;
        char letter = '#';
*/
    }
}
