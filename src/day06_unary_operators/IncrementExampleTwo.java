package day06_unary_operators;

public class IncrementExampleTwo {
    public static void main(String[] args) {

        int age = 20;
        System.out.println(age);

        System.out.println(age++); // 20
        System.out.println(age);

        System.out.println(age++ + 2); // 23 | age = 22
        System.out.println(age); // 22

        //                  23   + 2
        System.out.println(++age + 2); // 25 | age = 23
        System.out.println(age); // 23

        //                  24   +  25   + 2
        System.out.println(++age + ++age + 2); // age = 25
        //                   25  +  26   + 2
        System.out.println(age++ + age++ + 2); // 53
        System.out.println(age);

    }
}
