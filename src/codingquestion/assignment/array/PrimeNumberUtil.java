package codingquestion.assignment.array;

public class PrimeNumberUtil {

    public static boolean isPrime(int n) {
        int maxPossible = (int) Math.sqrt(n);
        for (int current = 2; current <= maxPossible; current++) {
            if (n % current == 0) {
                return false;
            }
        }
        return true;
    }
}
