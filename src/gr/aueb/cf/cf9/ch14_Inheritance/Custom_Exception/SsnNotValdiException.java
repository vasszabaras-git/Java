package gr.aueb.cf.cf9.ch14_Inheritance.Custom_Exception;

public class SsnNotValdiException extends Exception{

    public SsnNotValdiException(String message) {
        super(message);
    }
}
