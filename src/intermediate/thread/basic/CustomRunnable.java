package intermediate.thread.basic;

import java.util.stream.IntStream;

public class CustomRunnable implements Runnable {

    private final String id;

    public CustomRunnable(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        IntStream.range(0, 10)
                .forEach((_) -> {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print(id);
                });
    }
}
