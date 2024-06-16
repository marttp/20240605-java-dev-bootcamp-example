package intermediate.thread.virtualthread;

import java.util.stream.IntStream;

public class PlatformThreadExample {

    public static void main(String[] args) {
        Thread.ofPlatform().start(() -> {
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
    }
}
