package org.cbs.enums.convertors;

import org.cbs.enums.AccountTypeE;

import javax.persistence.AttributeConverter;

public class AccountTypeConvertor implements AttributeConverter<AccountTypeE, String> {
    @Override
    public String convertToDatabaseColumn(AccountTypeE accountTypeE) {
        return accountTypeE.getAccountType();
    }

    @Override
    public AccountTypeE convertToEntityAttribute(String s) {
        switch (s) {
            case "C":
                return AccountTypeE.CURRENT;
            case "S":
                return AccountTypeE.SAVINGS;
            case "L":
                return AccountTypeE.LOAN;
            case "T":
                return AccountTypeE.TERM_DEPOSIT;
            default:
                throw new IllegalArgumentException("Unknown" + s);
        }
    }
}