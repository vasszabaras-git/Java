package gr.aueb.cf.cf9.ch18_Bank_App._6_controller;

import gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18_Bank_App._3_core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18_Bank_App._2_dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._5_service.IAccountService;
import gr.aueb.cf.cf9.ch18_Bank_App._7_validation.validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
            throws ValidationException {
        AccountReadOnlyDTO readOnlyDTO;
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);

        // Validation
        Map<String, String> errors;
        errors = validator.validateInsertDTO(insertDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Proceed to service
        readOnlyDTO = accountService.createNewAccount(insertDTO);
        return readOnlyDTO;
    }

    public void deposit(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException {

        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        Map<String, String> errors;
        errors = validator.validateDepositDTO(depositDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.deposit(depositDTO);
    }

    public void withdraw(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException, InsufficientBalanceException {

        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        // Validation
        Map<String, String> errors;
        errors = validator.validateWithdrawDTO(withdrawDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.withdraw(withdrawDTO);
    }

    public BigDecimal getBalance(String iban)
            throws AccountNotFoundException, ValidationException {

        // Validation
        Map<String, String> errors;
        errors = validator.validateIban(iban);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        return accountService.getBalance(iban);
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}