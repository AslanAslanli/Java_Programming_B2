package day06_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Target";
        int numOfTv = 100;

        System.out.println("Person comes into the store and bought a TV");
        System.out.println("Number of TV now: " + --numOfTv);

        System.out.println("Another person came and bought 1 more TV");
        System.out.println("Number of TV now: " + --numOfTv);

        System.out.println("In the report out total TVs show: " + numOfTv);

        System.out.println("First person has returned a TV");
        System.out.println("Number of TV now: " + ++numOfTv);


    }
}
