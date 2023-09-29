package day14_string;

public class EmptyOrBlank {
    /*
    .equals(String)           --> return boolean
    .equalIgnoreCase(String)  --> return boolean
    .length()                 --> return Int
    .toUpperCase()            --> return String with lower case conversion
    .toLowerCase()            --> return String with upper case conversion
    .startsWith(String)       --> return boolean
    .endsWith(String)         --> return boolean
    .contains(String)         --> return boolean
    .trim()                   --> returns new String
    .isEmpty()                --> return boolean. check if there is no Character at all including spaces
    .isBlank()                --> return boolean. check if there is only SPACES in it
*/
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty()); // false

        str = ""; //Reassigned to ""
        System.out.println(str.isEmpty()); // true

        str = " "; //Reassigned to " "
        System.out.println(str.isEmpty());// false -- empty space is a Character as well

        str = " ";
        System.out.println(str.isBlank());// true -- as there is only space

        str = "            ";
        System.out.println(str.isBlank()); // true -- as there is nothing by spaces

        str = "                 .          ";
        System.out.println(str.isBlank()); // false -- as there is a non-space char in it










    }
}
