package codingquestion.assignment.gettingstarted;

import java.util.Scanner;

public class LargestOnStreamInput {
    /*
        Continuously prompt the user to enter integers.
        Keep track of the largest number entered so far.
        When the user enters a negative number or zero, stop taking input and display the largest number.
    * */
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Largest number from stream of input
                Please type any integer to find largest value
                Note: Type 0 or negative to stop stream
                """);
        String userInput;
        int largest = 0;
        while (true) {
            System.out.print("Number: ");
            userInput = scanner.nextLine();
            // If input cannot parse, let them error
            int n = Integer.parseInt(userInput);
            if (n <= 0) {
                break;
            }
            if (n > largest) {
                largest = n;
                System.out.println(STR."Largest number has changed to \{largest}");
            }
        }
        System.out.println(STR."Largest number from valid stream: \{largest}");
    }
}
