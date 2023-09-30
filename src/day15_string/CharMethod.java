package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123    -------> indexes in the String

        System.out.println(s.length()); // 4

        System.out.println(s.charAt(s.length()-1)); // j
        System.out.println(s.charAt(1)); // a
        System.out.println(s.charAt(2)); // v
        System.out.println(s.charAt(3)); // a


        //System.out.println(s.charAt(4)); // a -- Run time exception (error)
        //The code will run up until the code line above. Nothing will run after that

        //System.out.println(s.charAt("4")); // .charAt() only accepts int -- Compile time Exception (error)
        //The code will not run at all as it can not complie

        System.out.println("-----------------------");
        String s1 = "cake";
        //           0123
        //length --> 4

        String s2 = "apple";
        String s3 = "softskills";

        System.out.println(s1.charAt(s1.length() - 1));
        System.out.println(s2.charAt(s2.length() - 1));
        System.out.println(s3.charAt(s3.length() - 1));

        System.out.println("-------------------------");
        //How to get the last character

        String s4 = "loopcamp";

        int lastIndex = s4.length()-1;
        System.out.println(s4.charAt(lastIndex));// p

        int sendToLastIndex = s4.length()-2;
        System.out.println(s4.charAt(sendToLastIndex));// m




    }
}
