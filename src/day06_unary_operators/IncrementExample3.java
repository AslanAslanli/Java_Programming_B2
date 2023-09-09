package day06_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i = 5;
        int z = i++;

        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1;
        System.out.println(a); // 10
        System.out.println(b); // 11

        int c = ++a;


    }
}
