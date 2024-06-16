package intermediate.thread.concurrency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;

public class ConcurrencyExample {

    private static final Random random = new Random();

    public static void main(String[] args) {
        var shop = new GrilledParkShop(10);
        var es = Executors.newFixedThreadPool(3);
        List<GrilledPorkModifiable> porkModifiableList = List.of(
                new Consumer("c1"),
                new Consumer("c2"),
                new Merchant(),
                new Consumer("c3")
        );
        for (var gpm : porkModifiableList) {
            es.submit(() -> {
                try {
                    gpm.modify(shop, randomAmount());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        es.shutdown();
    }

    private static int randomAmount() {
        return random.nextInt(3) + 1;
    }
}
