package hardmode.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public void connect(final String host, final int port, final Scanner scanner) {
        try (var socket = new Socket(host, port);
             var writer = new PrintWriter(socket.getOutputStream(), true);
             var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            System.out.println("Established connection");
            String userInput;
            while (true) {
                System.out.print("Input: ");
                userInput = scanner.nextLine();
                if (userInput.isEmpty()) {
                    break;
                }
                writer.println(userInput);
                var serverResponse = reader.readLine();
                System.out.println(STR."Response: \{serverResponse}");
            }
        } catch (Exception e) {
            System.out.println("Connection closed...");
            throw new RuntimeException(e);
        }
    }
}
