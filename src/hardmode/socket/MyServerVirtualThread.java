package hardmode.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MyServerVirtualThread {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    public void start(final int port) {
        try (var serverSocket = new ServerSocket(port)) {
            System.out.println(STR."Server started on port: \{port}");
            try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
                while (true) {
                    // Established connection
                    var client = serverSocket.accept();
                    executorService.submit(() -> {
                        var clientIp = client.getInetAddress().getHostAddress();
                        var clientPort = client.getPort();
                        try (var clientInput = new BufferedReader(new InputStreamReader(client.getInputStream()));
                             var output = new PrintWriter(client.getOutputStream(), true)
                        ) {
                            for (String input; !(input = clientInput.readLine()).isEmpty(); ) {
                                System.out.println(STR."\{clientIp}:\{clientPort}:\{input}");
                                var message = new Message(ID_GENERATOR.getAndIncrement(), input);
                                output.println(message);
                            }
                        } catch (Exception e) {
                            try {
                                client.close();
                                System.out.println(STR."Connection closed for \{client}");
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    });
                }
            }
        } catch (IOException e) {
            System.out.println("Socket server is shutdown...");
            throw new RuntimeException(e);
        }
    }
}
