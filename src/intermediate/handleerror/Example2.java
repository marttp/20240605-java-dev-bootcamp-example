package intermediate.handleerror;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int opr1 = Integer.parseInt(scanner.nextLine());
            int opr2 = Integer.parseInt(scanner.nextLine());
            int answer = opr1 / opr2;
            System.out.println(answer);
        } catch (Exception e) {
            System.err.println("Internal server error");
            // if stop immediately after this catch
            // but you want to do something at last, use finally
        } finally {
            // Success or Fail, finally is executed
            System.out.println("Complete divide program");
        }
    }
}
