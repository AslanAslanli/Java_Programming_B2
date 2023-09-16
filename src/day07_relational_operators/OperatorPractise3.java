package day07_relational_operators;

public class OperatorPractise3 {
    public static void main(String[] args) {

        int h = 5; // declared and assigned value to a variable with int datatype
        int p = h;

        h++;
        System.out.println("h = " + h);
        System.out.println("p = " + p);

        int k = h++;
        System.out.println("h = " + h);
        System.out.println("k = " + k);

        int g = ++h;
        System.out.println("h = " + h);
        System.out.println("g = " + g);


    }
}
