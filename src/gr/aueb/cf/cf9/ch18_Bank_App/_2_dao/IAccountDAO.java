package gr.aueb.cf.cf9.ch18_Bank_App._2_dao;
// gia kathe model entity prepei n exoume to antistoixo DAO

import gr.aueb.cf.cf9.ch18_Bank_App._1_model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    Account saveOrUpdate(Account account);          //gets model entity (right) -- returns model entity(left)
    void remove(String iban);
    Optional<Account> findByIban(String iban);      //Account findByIban(String iban);  an den vrethei that epistrepsei null!!
    List<Account> getAllAccounts();
    long count();

    // Queries
    boolean isAccountExists(String iban);
}