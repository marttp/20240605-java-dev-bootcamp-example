package codingquestion.assignment.array;

import java.util.Scanner;

import static codingquestion.assignment.array.PrimeNumberUtil.isPrime;

public class PrimeNumberInRange {

    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range number to find prime number: ");
        int endRange = Integer.parseInt(scanner.nextLine());
        for (int n = 2; n <= endRange; n++) {
            boolean isCurrentNumberPrime = isPrime(n);
            if (isCurrentNumberPrime) {
                System.out.println(STR."\{n} is prime ✅");
            } else {
                System.out.println(STR."\{n} is not prime ❌");
            }
        }
    }
}
