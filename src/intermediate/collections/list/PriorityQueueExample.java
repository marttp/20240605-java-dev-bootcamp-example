package intermediate.collections.list;

import intermediate.collections.model.Product;
import util.TutorialUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        pqPrimitiveWrapper();
        pqDataObject();
    }

    private static void pqPrimitiveWrapper() {
        // Default is Min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(7);
        minHeap.add(9);
        minHeap.add(2);
        minHeap.add(1);
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        TutorialUtil.line();
        // Turn to Max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(7);
        maxHeap.add(9);
        maxHeap.add(2);
        maxHeap.add(1);
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }

    private static void pqDataObject() {
        var iPhone = new Product("iPhone", 35000.0, 20);
        var linuxLaptop = new Product("Laptop Linux", 13000.0, 35);
        var bookProduct = new Product("Book", 230.0, 10);
        // Min Heap of Products prices
        PriorityQueue<Product> minHeap = new PriorityQueue<>(
                Comparator.comparingDouble(Product::prices)
        );
        minHeap.add(iPhone);
        minHeap.add(linuxLaptop);
        minHeap.add(bookProduct);
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        TutorialUtil.line();
        // Max Heap of Products amount
        PriorityQueue<Product> maxHeap = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.amount(), e1.amount())
        );
        maxHeap.add(iPhone);
        maxHeap.add(linuxLaptop);
        maxHeap.add(bookProduct);
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
