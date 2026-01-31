package gr.aueb.cf.cf9.ch18_Bank_App._4_dto;

import java.math.BigDecimal;

public record  AccountInsertDTO(String iban, BigDecimal balance) {

    //
    public static AccountInsertDTO empty() {
        return new AccountInsertDTO("", BigDecimal.ZERO);
    }

}
//immutable, oxi setters
//constructor
//equals, hashcode, tostring
//getters iban() oxi getIban()

//public class AccountInsertDTO {
//    private String iban;
//    private double balance;
//
//    public AccountInsertDTO() {
//
//    }
//
//    public AccountInsertDTO(String iban, double balance) {
//        this.iban = iban;
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String toString() {
//        return "AccountInsertDTO{" + "iban=" + iban + ", balance=" + balance + '}';
//    }
//}