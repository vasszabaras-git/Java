package gr.aueb.cf.cf9.ch18_Bank_App._4_dto;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}
