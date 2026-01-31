package gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
