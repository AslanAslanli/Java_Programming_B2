package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b; //this is where 40 becomes int

        System.out.println(b); // 40 is byte DataType
        System.out.println(i); // 40 is int DataType

        int i2 = 200;
        byte b2 = (byte) i2; // int is bigger than byte so we must cast it
        System.out.println("b2 = " + b2);

        int i3 = 500;
        long l1 = i3;

        long l2 = 200;
        int i4 = (int) l2;

        double d = 50;
        System.out.println(d); // 50.0
        int i5 = (int) d;
        System.out.println("i5 = " + i5);

        double d2 = 40;
        byte b3 = (byte) d2;
        System.out.println("b2 = " + b2);
        System.out.println("b = " + b);

        //DATA LOSS
        // With the numbers outside of the range

        int i6 = 400;
        byte b4 = (byte) i6;
        System.out.println("b4 = " + b4);

        double d3 = 45.56;
        int i7 = (int) d3;
        System.out.println("d3 = " + d3);
        System.out.println("i7 = " + i7);

        char a = 'a';
        int a1 = (int) a;
        System.out.println("a1 = " + a1);
        System.out.println("a = " + a);

    } }

