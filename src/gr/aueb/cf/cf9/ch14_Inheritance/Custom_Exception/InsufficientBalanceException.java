package gr.aueb.cf.cf9.ch14_Inheritance.Custom_Exception;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}
