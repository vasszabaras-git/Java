package gr.aueb.cf.cf9.ch14_Inheritance.Custom_Exception;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(String message){
        super(message);
    }

}
