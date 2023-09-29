package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {
/*
    .equals(String)           --> return boolean
    .equalIgnoreCase(String)  --> return boolean
    .length()                 --> return Int
    .toUpperCase()            --> return String with lower case conversion
    .toLowerCase()            --> return String with upper case conversion
    .startsWith(String)       --> return boolean
    .endsWith(String)         --> return boolean
    .contains(String)         --> return boolean
*/
        String s = "            Thursday         ";
        System.out.println(s.length()); //19
        System.out.println(s.trim()); //Thursday

        s = "            Thur    sday         ";
        System.out.println(s.trim()); //"Thur    sday". it only trims from beginning and from end
        System.out.println(s.length());

        s = s.trim(); //Thur    sday
        System.out.println(s.length()); //12

        System.out.println("-----------");
        System.out.println(s.startsWith("Thu")); // "Thursday"

        String str = "       java is fun         ";
        System.out.println(str.endsWith("   fun"));

        str.trim();






    }
}
