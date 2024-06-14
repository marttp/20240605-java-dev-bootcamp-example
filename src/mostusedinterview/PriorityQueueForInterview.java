package mostusedinterview;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForInterview {

    // PriorityQueue -> Queue with condition
    // -> expectation element meet most condition -> Dequeue first

    // Example - Member - Rank Bronze, Silver, Gold, Platinum
    // -> Platinum, Gold, Silver, Bronze
    // -> Bronze, Silver, Gold, Platinum

    // Offer -> TC: O(log (n)) (Enqueue)
    // Poll -> TC: O(log (n)) (Dequeue)
    // Peek (see front element) -> TC: O(1)

    // PriorityQueue can implement Min Heap & Max Heap
    public static void main(String[] args) {
        // Design example with Max Heap
        PriorityQueue<Member> maxHeap = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.type.ranking, e1.type.ranking)
        );
        maxHeap.offer(new Member("Mart", Type.SILVER));
        maxHeap.offer(new Member("Molly", Type.GOLD));
        maxHeap.offer(new Member("Joshua", Type.BRONZE));
        maxHeap.offer(new Member("Peter", Type.GOLD));

        while (!maxHeap.isEmpty()) {
            var current = maxHeap.poll();
            System.out.println(current);
        }

        PriorityQueue<Member> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.type.ranking)
        );
        minHeap.offer(new Member("Mart", Type.SILVER));
        minHeap.offer(new Member("Molly", Type.GOLD));
        minHeap.offer(new Member("Joshua", Type.BRONZE));
        minHeap.offer(new Member("Peter", Type.GOLD));

        while (!minHeap.isEmpty()) {
            var current = minHeap.poll();
            System.out.println(current);
        }
    }

    private record Member(String name, Type type) {
    }

    private enum Type {
        BRONZE(1),
        SILVER(2),
        GOLD(3),
        PLATINUM(4);

        private final int ranking;

        Type(int ranking) {
            this.ranking = ranking;
        }

        public int getRanking() {
            return this.ranking;
        }
    }
}
