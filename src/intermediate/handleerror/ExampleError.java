package intermediate.handleerror;

public class ExampleError {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        // WARNING: This is for generate critical error - StackOverflowError
        // Oh, I forgot to update condition
        return factorial(n) * n;
    }
}
