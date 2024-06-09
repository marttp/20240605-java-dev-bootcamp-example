package codingquestion.assignment.array;

import static codingquestion.assignment.array.PrimeNumberUtil.isPrime;

public class PrimeNumberGivenArray {

    void main() {
        int[] example = {22, 58, 53, 7, 100, 11, 106, 67, 88};
        for (int n : example) {
            boolean isCurrentNumberPrime = isPrime(n);
            if (isCurrentNumberPrime) {
                System.out.println(STR."\{n} is prime ✅");
            } else {
                System.out.println(STR."\{n} is not prime ❌");
            }
        }
    }
}
