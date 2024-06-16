package intermediate.thread.basic;

import java.util.stream.IntStream;

public class ThreadExample {

    // Main thread
    public static void main(String[] args) {
        // New - extend class
        var customThread = new CustomThread(String.valueOf(1));
        // New - implement from Runnable
        var customRunnableForThread =
                new CustomRunnable(String.valueOf(2));
        var customThreadFromRunnable = new Thread(customRunnableForThread);
        // customThreadFromLambdaExpression
        Runnable lambda = () -> {
            IntStream.range(0, 10)
                    .forEach((_) -> {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(3);
                    });
        };
        var customThreadFromLambdaExpr = new Thread(lambda);

        // Start
        customThread.start();
        customThreadFromRunnable.start();

        customThreadFromLambdaExpr.setDaemon(true);
        customThreadFromLambdaExpr.start();

        System.out.println(customThread.isDaemon());
        System.out.println(customThreadFromRunnable.isDaemon());
        System.out.println(customThreadFromLambdaExpr.isDaemon());
    }
}
