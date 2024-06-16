package intermediate.thread.executor;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExecutorExample {

    public static void main(String[] args) {
        try (ExecutorService es = Executors.newSingleThreadExecutor()) {
            es.submit(() -> IntStream.range(0, 10)
                    .forEach((_) -> {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(1);
                    }));
        }
        // Thread Pool
        var poolSize = 10;
        try (var es = Executors.newFixedThreadPool(poolSize)) {
            IntStream.range(0, 20)
                    .forEach(n -> {
                        es.submit(() -> {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.print(STR." \{n} ");
                        });
                    });
        }

        try (var es = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 20)
                    .forEach(n -> {
                        es.submit(() -> {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.print(STR." \{n} ");
                        });
                    });
        }

        Callable<Person> callableTask = () -> {
            // Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(3);
            return new Person(1, "Mart");
        };

        try (var es = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<Person> result = es.submit(callableTask);
            var person = result.get();
            System.out.println(person);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private record Person(int id, String name) {

    }
}
