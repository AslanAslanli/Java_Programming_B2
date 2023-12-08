package day44_map_and_functions.string_builder_buffer;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {

        String str1 = "loopcamp";
        String str2 = new String("loopcamp");

        str1 = str1 + " course";

        StringBuilder str3 = new StringBuilder("loopcamp");
        System.out.println(str3);
        str3.append(" course");
        System.out.println(str3);

        StringBuffer str4 = new StringBuffer("loopcamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);


    }
}
