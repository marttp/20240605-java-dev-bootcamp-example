package intermediate.handleerror.stockmgt;

import java.util.Scanner;

public class StockManagementApp {

    private static final Product PRODUCT = new Product("Smartphone", 10);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int amount = parseDeductAmount(input);
            purchase(PRODUCT, amount);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Processed incoming request!");
        }
    }

    private static void purchase(Product product, int amount) throws OutOfStockException {
        int currentAmount = product.getStock();
        // Business logic condition handling
        if (currentAmount < amount) {
            throw new OutOfStockException(STR."The stock of \{product.getName()} is insufficient");
            // Stop immediately
        }
        // Continue program
        var remain = product.getStock() - amount;
        product.setStock(remain);
        System.out.println(STR."Current stock for \{product.getName()}: \{product.getStock()}");
    }

    private static int parseDeductAmount(String input) throws DeductAmountException {
        try {
            return Integer.parseInt(input);
        } catch (RuntimeException e) {
            // Custom exception from Java to another exception which we created by ourselves
            throw new DeductAmountException();
        }
    }
}
