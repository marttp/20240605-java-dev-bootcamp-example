package codingquestion.assignment.gettingstarted;

import java.util.Scanner;

public class Factorial {

    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = scanner.nextLine();
        // Assume input positive integer
        int n = Integer.parseInt(input);
        // 5! = 5 * 4 * 3 * 2 * 1
        // 1! = 1, 0! = 1

//        int result = iterative1(n);
//        int result = iterative2(n);
        int result = recursive(n);
        System.out.println(STR."Result: \{result}");
    }

    private static int iterative1(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int multiplier = 2; multiplier <= n; multiplier++) {
            result *= multiplier;
        }
        return result;
    }

    private static int iterative2(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        int multiplier = 2;
        while (multiplier <= n) {
            result *= multiplier;
            multiplier++;
        }
        return result;
    }

    private static int recursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursive(n - 1) * n;
    }
}
