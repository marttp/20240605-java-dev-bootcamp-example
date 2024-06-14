package mostusedinterview;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForInterview {

    /*
       Queue - First-In-First-Out (FIFO)

       Offer (insertion from tail) -> TC: O(1) (Enqueue)
       Poll (remove front element) -> TC: O(1) (Dequeue)
       Peek (see front element) -> TC: O(1)
    * */
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        // LinkedList<Person> queue = new LinkedList<>();
        queue.offer(new Person("Mart"));
        queue.offer(new Person("Jame"));
        queue.offer(new Person("Torres"));
        queue.offer(new Person("Steven"));
        System.out.println(queue);
        System.out.println(queue.peek());
        var frontOfQueue = queue.poll();
        System.out.println(frontOfQueue);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            var person = queue.poll();
            System.out.println(person);
        }
    }

    private record Person(String name) {

    }
}
