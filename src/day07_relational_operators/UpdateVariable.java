package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {

        // how many different ways we can add 1
        int count = 0;
        count += 5;

        System.out.println("count = " + count);

        count -= 10;
        System.out.println("count = " + count);

        count *= 2;
        System.out.println("count = " + count);

        count /= 3;
        System.out.println("count = " + count);

        count %= 2;
        System.out.println("count = " + count);

    }
}
