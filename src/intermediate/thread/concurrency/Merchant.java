package intermediate.thread.concurrency;

import java.util.concurrent.TimeUnit;

public class Merchant implements GrilledPorkModifiable {

    @Override
    public void modify(GrilledParkShop shop, int n) throws InterruptedException {
        synchronized (shop.getLock()) {
            var amount = shop.getGrilledPorkAmount();
            TimeUnit.SECONDS.sleep(2);
            shop.setGrilledPorkAmount(amount + n);
            System.out.println(STR."[M] Current pork: \{shop.getGrilledPorkAmount()}");
        }
    }
}
