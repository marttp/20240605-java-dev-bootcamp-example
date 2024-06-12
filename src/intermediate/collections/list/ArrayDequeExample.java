package intermediate.collections.list;

import intermediate.collections.model.Person;
import util.TutorialUtil;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        var mart = new Person("Mart");
        var peter = new Person("Peter");
        var silva = new Person("Silva");

        // Queue - FIFO (First-In-First-Out)
        Deque<Person> queue = new ArrayDeque<>();
        queue.add(mart);
        queue.add(peter);
        queue.add(silva);
        // Who is at front?
        System.out.println(STR."\{queue.peek()} is at front");
        for (var p : queue) {
            System.out.println(STR."\{p} is on queue");
        }
        TutorialUtil.line();
        while (!queue.isEmpty()) {
            // Walk out from queue
            var person = queue.poll();
            System.out.println(STR."\{person} is walking out");
            System.out.println(STR."Number on queue: \{queue.size()}");
        }

        // ArrayDeque can implement as stack
        Deque<Person> stack = new ArrayDeque<>();
        // Remove from same direction which you added
        // [] <- push on tail
        stack.offerLast(mart);
        stack.offerLast(peter);
        stack.offerLast(silva);
        // Example of pop stack
        System.out.println(stack.pollLast());
    }
}
