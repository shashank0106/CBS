package org.cbs.enums.convertors;

import org.cbs.enums.AccountStatusE;

import javax.persistence.AttributeConverter;

public class AccountStatusConvertor implements AttributeConverter<AccountStatusE, String> {
    @Override
    public String convertToDatabaseColumn(AccountStatusE accountStatusE) {
        return accountStatusE.getStatus();
    }

    @Override
    public AccountStatusE convertToEntityAttribute(String s) {
        switch (s) {
            case "D":
                return AccountStatusE.DORMANT;
            case "C":
                return AccountStatusE.CLOSED;
            case "A":
                return AccountStatusE.ACTIVE;
            default:
                throw new IllegalArgumentException("Unknown" + s);
        }
    }
}
