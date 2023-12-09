package day41_collections.collections;
import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek());

        stack.pop(); // removes the element at the top of stack and returns it
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.remove(0));
        System.out.println(stack);

    }
}
