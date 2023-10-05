package day14_string;

public class RecapMethods {
    public static void main(String[] args) {

        String s = "pen"; // s is a String literal, so it is in the String pool
        String s2 = new String("pen"); //s2 is object in the heap, as we used "new" keyword

        System.out.println("Compare with == " + (s == s2));//false - bec memory locs are dif
        System.out.println("Compare with .equals(String) " + (s.equals("pen")));//true - bec values are compared

        System.out.println("Compare with .equals(String) " + (s.equals("Pen")));//false - bec values are not exactly same

        String ss = "Pen";
        System.out.println("Compare with .equals(String) " + (s.equals(ss)));//true - bec valeus are the same

        s = "PeN";
        ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss);//this will object values by ignoring case sensitiveness
        System.out.println(isSame); // true

        if (isSame){
            System.out.println("Hello");
        }

        ss = "PENN";
        if (s.equals(ss)) { //PEN <---> PENN. these are not the same
            System.out.println("Hello");
        } else {
            System.out.println("bye");
        }

        // s ---> PEN
        // s ---> PENN

        System.out.println(s.length()); //3
        System.out.println(s.length()); //4

        int a = s.length(); //3
        int b = ss.length(); //4

        if (a < 4){ // 3 < 4
            System.out.println("Short word");
        } else {
            System.out.println("Not short");
        }

        System.out.println("aaaaaa".length()); // 6
        System.out.println("a    a".length()); // still 6. spaces count as spaces too
        System.out.println("".length()); // 0; just an empty string
























    }
}
