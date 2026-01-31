package gr.aueb.cf.cf9.ch18_Bank_App._1_model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String iban;
    private BigDecimal balance;

    public Account() {
    }

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

        @Override
    public boolean equals(Object x) {
        if (!(x instanceof Account  y)) return false; //check if other is Account type and save it into account variable
        return Objects.equals(this.getIban(), y.getIban()); //null safe
//        return this.iban.equals(account.iban);  // not null safe
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban());
    }

}