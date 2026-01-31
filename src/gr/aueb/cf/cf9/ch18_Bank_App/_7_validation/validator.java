package gr.aueb.cf.cf9.ch18_Bank_App._7_validation;

import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18_Bank_App._4_dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class validator {

    /**
     * No instances of this class should be available.
     */
    private validator() {

    }

    public static Map<String, String> validateInsertDTO(AccountInsertDTO insertDTO) {
        Map<String, String> errors = new HashMap<>();

        if (insertDTO.iban() == null || !insertDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "Το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (insertDTO.balance() == null || insertDTO.balance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το υπόλοιπο δεν μπορεί να είναι αρνητικό.");
        }

        return errors;
    }

    public static Map<String, String> validateDepositDTO(AccountDepositDTO depositDTO) {
        Map<String, String> errors = new HashMap<>();

        if (depositDTO.iban() == null || !depositDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "Το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (depositDTO.amount() == null || depositDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Το ποσό κατάθεσης δεν μπορεί να είναι αρνητικό.");
        }

        return errors;
    }

    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO withdrawDTO) {
        Map<String, String> errors = new HashMap<>();

        if (withdrawDTO.iban() == null || !withdrawDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "Το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (withdrawDTO.amount() == null || withdrawDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Το ποσό ανάληψης δεν μπορεί να είναι αρνητικό.");
        }

        return errors;
    }

    public static Map<String, String> validateIban(String iban) {
        Map<String, String> errors = new HashMap<>();

        if (iban == null || !iban.trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "Το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }
        return errors;
    }

}