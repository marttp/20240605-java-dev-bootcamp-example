package intermediate.handleerror.stockmgt;

public class DeductAmountException extends Exception {

    private static final String MESSAGE = "Deduct amount error";

    public DeductAmountException() {
        super(MESSAGE);
    }
}
