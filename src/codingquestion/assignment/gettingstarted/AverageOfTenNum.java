package codingquestion.assignment.gettingstarted;

import java.util.Scanner;

public class AverageOfTenNum {
    /*
        Write a program that takes 10 numbers as input from the user
        - Condition - Input one at a time.
        Calculate and display the average of these numbers.
    * */
    void main() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            double input = Double.parseDouble(scanner.nextLine());
            sum += input;
        }
        System.out.println(STR."Average: \{sum / n}");
    }
}
