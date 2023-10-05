package day13_string;

public class StringMemory {
    public static void main(String[] args) {

        int num = 4;
        byte num2 = 5;
        char letter = 'f';
        boolean result = true;
        double num3 = 34.5;
        // double num4 = new double(4); //this is not valid. can not do this with double
        String str = "Hello"; // creating a string by literals
        String str2 = new String("Hello"); // creating a String by 'new' keyword

        String first = "java"; // String literal --> Stored ---> Heap Pool
        String second =  new String("java"); //String object (String by new keyword) --> Stored - Directly Heap not pool
        String third = "java";
        String fourth = new String("java");


        System.out.println(first == second); // false
        System.out.println(first == third); // true
        System.out.println(second == fourth); // false



    }
}
