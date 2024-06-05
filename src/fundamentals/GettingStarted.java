package fundamentals;

import java.util.Scanner;

public class GettingStarted {


    /*
    * This the example multiple comment
    * The purpose of this multiline is sometime, you need to give more detail about what you have written
    * */
    public static void main(String[] args) {
        // This is the example of the single line comment
        // Your scanner is using for getting user input via your keyboard or from the other datasource
        // depending on what you provide
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, My name is Thanaphoom Babparn");
        System.out.println("I'm living in Tokyo, Japan");

        System.out.print("Please provide any input 1: ");
        String input1 = scanner.nextLine();
        System.out.println("User Input 1: " + input1);

        System.out.print("Please provide any input 2: ");
        String input2 = scanner.nextLine();
        System.out.println("User Input 2: " + input2);
    }
}
