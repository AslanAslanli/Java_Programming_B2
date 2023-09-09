package day05_variables;

public class MyName {
    public static void main (String [] args){

        char letter1 = 'A', letter2 = 's', letter3 = 'l', letter4 = 'a', letter5 = 'n';
        System.out.println("letter1 = " + letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);

        System.out.println("My first name is: " + letter1 + letter2 + letter3 + letter4 + letter5);
        System.out.println(letter1 + "" + letter2 + "" + letter3 + "" + letter4 + "" + letter5);

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5;
        System.out.println("myName is = " + myName);
            /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */

    }
}
