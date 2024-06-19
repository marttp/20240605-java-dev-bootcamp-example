package hardmode.socket;

import java.util.Scanner;

public class SocketExample {

    private static final int PORT = 8080;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        System.out.println("""
                Server: 1
                Server (VT): 11
                Client: 2
                """);
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> new MyServer().start(PORT);
            case 11 -> new MyServerVirtualThread().start(PORT);
            case 2 -> new MyClient().connect(HOST, PORT, scanner);
            default -> throw new IllegalArgumentException("Unknown choice!");
        }
    }
}
