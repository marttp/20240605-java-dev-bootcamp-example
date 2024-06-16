package intermediate.thread.concurrency;

public class GrilledParkShop {

    private final Lock lock;
    private int grilledPorkAmount;

    public GrilledParkShop(int grilledPorkAmount) {
        this.grilledPorkAmount = grilledPorkAmount;
        this.lock = new Lock();
    }

    public Lock getLock() {
        return lock;
    }

    public int getGrilledPorkAmount() {
        synchronized(lock) {
            return grilledPorkAmount;
        }
    }

    public void setGrilledPorkAmount(int grilledPorkAmount) {
        synchronized (lock) {
            this.grilledPorkAmount = grilledPorkAmount;
        }
    }

    private static class Lock {}
}
