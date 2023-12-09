package day39_a_polymorphism.covariant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class B extends A{
    public static void main(String[] args) {
        A[] arr = {new A(), new B()};

        ArrayList<A> list = new ArrayList<>(Arrays.asList(new A(), new B()));

        System.out.println(list);
    }

    public B test(){

        return new B();
    }
    @Override
    public void test2 () {
        System.out.println("Overrided in child");
    }

}
