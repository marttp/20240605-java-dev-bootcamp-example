package codingquestion.assignment.gettingstarted;

import java.util.Scanner;

public class TriangleOrSquare {

    /*
        Ask the user if they want to calculate the area of a triangle or a square.
        Based on their choice:
        Triangle: Prompt for the base and height, then calculate and display the area.
        Square: Prompt for the side length, then calculate and display the area.
    * */
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Area calculate program
                'T' => Triangle
                'S' => Square
                """);
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();
        // Assume all number from input will positive
        if (choice.equals("T")) {
            System.out.print("Enter base: ");
            double base = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter height: ");
            double height = Double.parseDouble(scanner.nextLine());
            double area = 0.5 * base * height;
            System.out.println(STR."Triangle area: \{area}");
        } else if (choice.equals("S")) {
            System.out.print("Enter side length: ");
            double length = Double.parseDouble(scanner.nextLine());
            double area = length * 4;
            System.out.println(STR."Square area: \{area}");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
