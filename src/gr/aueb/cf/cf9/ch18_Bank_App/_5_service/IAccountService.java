package gr.aueb.cf.cf9.ch18_Bank_App._5_service;

import gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO);

    void deposit(AccountDepositDTO depositDTO) throws AccountNotFoundException;
    void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
}