package fundamentals;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your input: ");
        String text = scanner.nextLine();
        System.out.println("This is what you have typed: " + text);
    }
}
