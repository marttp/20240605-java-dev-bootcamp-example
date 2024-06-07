package codingquestion.assignment.gettingstarted;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = scanner.nextLine();
        // Assume input can type only number system
        int n = Integer.parseInt(input);
        // % 2 => 0 / 1
        solution1(n);
        solution2(n);
    }

    private static void solution1(int n) {
        if (n % 2 == 0) {
            System.out.println(STR."\{n} is even");
        } else {
            System.out.println(STR."\{n} is odd");
        }
    }

    private static void solution2(int n) {
        String result = switch (n % 2) {
            case 0 -> "Even";
            case 1 -> "Odd";
            default -> "N/A";
        };
        System.out.println(STR."\{n} is \{result}");
    }
}
