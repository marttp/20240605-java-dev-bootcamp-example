package intermediate.collections.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Stack - LIFO (Last-In-First-Out)
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.peek()); // 5
        stack.push(2);
        System.out.println(stack.peek()); // 2
        var previousValue = stack.pop(); // 2
        System.out.println(previousValue);
        stack.push(3);
        System.out.println(stack.peek()); // 3
        if (stack.empty()) {
            System.out.println("Stack empty");
        } else {
            System.out.println("Stack contains element");
        }
        // Check current size
        System.out.println(STR."Current size: \{stack.size()}");
    }
}
