package intermediate.handleerror.stockmgt;

public class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}
