package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // short is smaller than float so implicit casting happens
        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);

        float num3 = 100.5F;
        short num4 = (short) num3; // float is bigger than short, so explicit casting needed
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        float num5 = 300;
        byte num6 = (byte) num5;
        short num7 = (short) num5;
        System.out.println("num5 = " + num5); // 300.0
        System.out.println("num6 = " + num6); // out of limit -128 -- 127
        System.out.println("num7 = " + num7); // 300

        char letter = 'A';
        int letterInt = letter;
        System.out.println("letter = " + letter);
        System.out.println("letterInt = " + letterInt);

        int let2 = 66;
        char let3 = (char) let2;
        System.out.println(let3);
        System.out.println((char)66); // same thing as above. but just directly casted in the println

        System.out.println((int)'&'); // this will print



    }
}
