package day05_variables;

public class CharExample {
    public static void main(String[] args) {

        //assign characters to the char datatype

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
        //variableName.soutv
        System.out.println("letterOne = " + letterOne);
        System.out.println("letterTwo = " + letterTwo);
        System.out.println("numberOne = " + numberOne);
        System.out.println("specialOne = " + specialOne);

        System.out.println(letterOne + letterTwo); // 97 + 90 = 187

        char letterThree = 65; // 65 represents letter A in ASCII table
        System.out.println(letterThree);
       //char letterThree = '65'; // this is invalid because there are two characters and char is limited to one only
        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne); //97 + 90 + 65 + 57 + 38
        // Concatenation bec of string
        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne);

        // RULE: Concatenation starts from first string
        System.out.println(letterOne + letterTwo + "chars: " + letterThree + numberOne + specialOne); // Concatenation bec of string







    }

}
