package mostusedinterview;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackForInterview {

    /* Stack - Last-In-First-Out (LIFO)
       Push (insertion) -> TC: O(1)
       Pop (remove top element) -> TC: O(1)
       Peek (see top element) -> TC: O(1)

        [Book4] <- Access top - PEEK
        [Book3]
        [Book2]
        [Book1] [Book5] < POP
    * */

    public static void main(String[] args) {
        Deque<Book> stack = new ArrayDeque<>();
        var book1 = new Book("Book1");
        var book2 = new Book("Book2");
        var book3 = new Book("Book3");
        var book4 = new Book("Book4");
        var book5 = new Book("Book5");

        System.out.println();
        stack.push(book1); // Example push
        System.out.println(stack);
        stack.push(book2);
        System.out.println(stack);
        var book2Pop = stack.pollFirst();
        System.out.println(book2Pop);
        System.out.println(stack);
        stack.push(book3);
        stack.push(book4);
        stack.push(book5);
        System.out.println(stack);

        while (!stack.isEmpty()) {
            var book = stack.pollFirst();
            System.out.println(book);
        }
        System.out.println(STR."Stack is empty: \{stack.isEmpty()}");
    }

    private record Book(String title) {

    }
}
