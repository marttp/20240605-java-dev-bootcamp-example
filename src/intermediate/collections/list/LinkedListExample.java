package intermediate.collections.list;

import intermediate.collections.model.Person;
import util.TutorialUtil;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        var mart = new Person("Mart");
        var peter = new Person("Peter");
        var silva = new Person("Silva");

        LinkedList<Person> queue = new LinkedList<>();
        queue.add(mart);
        queue.add(peter);
        queue.add(silva);

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
    }
}
