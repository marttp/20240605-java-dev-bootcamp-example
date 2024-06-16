package intermediate.thread.virtualthread;

import java.util.stream.IntStream;

public class VirtualThreadExample {

    public static void main(String[] args) throws InterruptedException {
        var thread = Thread.ofVirtual().start(() -> {
            IntStream.range(0, 10)
                    .forEach((_) -> {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(3);
                    });
        });
        var alternativeStartVirtualThread = Thread.startVirtualThread(() -> {
            IntStream.range(0, 10)
                    .forEach((_) -> {
                        try {
                            Thread.sleep(800);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(4);
                    });
        });

        thread.join();
        alternativeStartVirtualThread.join();
    }
}
