package gr.aueb.cf.cf9.ch18_Bank_App._2_dao;

import gr.aueb.cf.cf9.ch18_Bank_App._1_model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private final List<Account> accounts = new ArrayList<>();              //list interface, arraylist the implemnation  --corresponds to the db/storage

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);  // override equals

        if (index == -1) {                      // Αν δεν υπάρχει στη λίστα
            accounts.add(account);              // τότε κάνε insert
            return account;
        }
        // Αν υπάρχει ήδη το Account
        accounts.set(index, account);           // τότε κάνε update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(x -> x.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(x -> x.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
        //return new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
        // return List.copyOf(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }

    @Override
    public long count() {
        return accounts.size();
    }


//    -------------

}