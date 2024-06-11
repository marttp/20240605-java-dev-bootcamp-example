package intermediate.handleerror;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int opr1 = Integer.parseInt(scanner.nextLine());
            int opr2 = Integer.parseInt(scanner.nextLine());
            int answer = opr1 / opr2;
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.err.println("We got unexceptable value");
        } catch (NumberFormatException e) {
            System.err.println("Some number cannot parse to number");
        }
    }
}
