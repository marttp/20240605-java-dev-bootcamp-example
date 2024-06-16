package intermediate.thread.concurrency;

import java.util.concurrent.TimeUnit;

public class Consumer implements GrilledPorkModifiable {

    private final String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void modify(GrilledParkShop shop, int n) throws InterruptedException {
        synchronized (shop.getLock()) {
            var amount = shop.getGrilledPorkAmount();
            if (n > amount) {
                throw new RuntimeException("Out of stock!");
            }
            TimeUnit.SECONDS.sleep(1);
            shop.setGrilledPorkAmount(amount - n);
            System.out.println(STR."[C] Current pork: \{shop.getGrilledPorkAmount()}");
        }
    }
}
