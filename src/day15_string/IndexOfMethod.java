package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "pen";

        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));
////////////////////////////////////////////////////////////////
        if (str.indexOf("x") == -1) {
            System.out.println("x is not in the entered word");
        }

        if (!str.contains("x")) {
            System.out.println("x is not in the entered word");
        }
///////////////////////////////////////////////////////////////
        System.out.println("-------------------------------");

        String str2 = "pencil";
        System.out.println(str2.indexOf("p")); //0

        str2 = "encpil";
        System.out.println(str2.indexOf("p")); //3

        System.out.println("---------------------");
        String str3 = "loopcamp";
        //             01234567
        System.out.println(str3.indexOf("pc")); //3
        System.out.println(str3.indexOf(" camp")); //4
        System.out.println(str3.indexOf("camping")); //-1
        System.out.println(str3.indexOf("loo")); //0
        System.out.println(str3.indexOf("look")); //-1


    }
}
