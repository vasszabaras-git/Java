package gr.aueb.cf.cf9.ch14_Inheritance.Custom_Exception;

import java.time.LocalDateTime;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;             // ΑΦΜ
    private double balance;

    public Account() {

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }


    // Public API

    /**
     * Deposits the specified amount of money into the account.
     * @param amount   the amount of money to deposit.
     * @throws NegativeAmountException  if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) throw new NegativeAmountException("The amount " + amount + " should be positive.");
            balance += amount;
            // log
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount=  " + amount + " is not allowed." + "\n" + e.getMessage());
            throw e;
        }

    }

    /**
     * Withdraws the specified amount of money from the account.
     *
     * @param amount         the amount of money to withdraw.
     * @param ssn            the SSN of the account holder.
     * @throws SsnNotValdiException     If the amount is negative, the balance is insufficient,the SSN does not match.
     * @throws InsufficientBalanceException
     * @throws NegativeAmountException
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount < 0) throw new NegativeAmountException("The amount = " + amount + "should be positive.");
            if (amount > balance) throw new InsufficientBalanceException("The balance is insufficient.");
            if (!isSsnValid(ssn)) throw new SsnNotValdiException("This SSN does not match.");
            balance -= amount;
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValdiException e) {
            System.err.println(LocalDateTime.now() + "\n" +e.getMessage());
            throw e;
        }

    }

    /**
     * Returns the current balance of the account.
     * @return  the current balance of the account.
     */
    public double getAccountBalance () {
        return getBalance();
    }

    /**
     * Returns the state of the account as a string.
     * @return the string representation of the
     * {@link Account} object
     */
    public String accountToString() {
        return "Account: " + id + " IBAN: " + iban + " Firstname: " + firstname +
                " Lastname: " + lastname + " SSN: " + ssn + " Balance: " + balance;
    }

    private boolean  isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}



