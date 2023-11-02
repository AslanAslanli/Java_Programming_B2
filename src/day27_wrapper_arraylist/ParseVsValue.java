package day27_wrapper_arraylist;

public class ParseVsValue {
    public static void main(String[] args) {

        String str = "30";
        int num1 = Integer.parseInt(str);
        Integer num2 = Integer.valueOf(str);

        int num3 = Integer.valueOf(str);

        Integer num4 = Integer.parseInt(str);
    }
}
