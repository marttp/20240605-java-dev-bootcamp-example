package fundamentals;

import java.util.List;
import java.util.Random;

import static util.TutorialUtil.line;

public class Iteration {

    public static void main(String[] args) {
        plainForLoop();
        line();
        whileLoop();
        line();
        doWhileLoop();
        line();
        int recursiveValue = recursiveExample(5);
        System.out.println("recursiveValue: " + recursiveValue);
        line();
        forEachExample();
    }

    // String concat - counting
    public static void plainForLoop() {
        String message = "";
        // Building block - Initialization, Condition, Updating
        for (int n = 1; n <= 10; n++) {
            message += STR."\{n} ";
        }
        System.out.println(STR."plainForLoop: \{message}");
    }

    // Example Dice - 4
    public static void whileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Check before do something
        while (dice != 4) {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        }
        System.out.println("whileLoop dice amount until 4: " + counter);
    }

    // Example Dice - 4
    public static void doWhileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Do something then start checking
        do {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        } while (dice != 4);
        System.out.println("whileLoop dice amount until 4: " + counter);
    }

    public static int recursiveExample(int count) {
        if (count < 0) {
            return 0;
        }
        // Store the function/method itself to JVM's Stack and then resolve (pop) once base case complete
        if (count == 0) {
            return 0;
        }
        var recursiveValue = recursiveExample(count - 1);
        System.out.println("recursiveValue: " + recursiveValue);
        return recursiveValue + 1;
    }

    // Summation - 14
    public static void forEachExample() {
        // Use on Array/List with expectation to do on every element
        int sum1 = 0;
        int[] exampleArray = new int[]{5,2,3,4};
        for (int n : exampleArray) {
            sum1 += n;
        }
        System.out.println(STR."sum1: \{sum1}");
        int sum2 = 0;
        List<Integer> exampleList = List.of(5,2,3,4);
        for (int n : exampleList) {
            sum2 += n;
        }
        System.out.println(STR."sum2: \{sum2}");
    }
}
