package org.cbs.accounts.model;

import lombok.Data;
import org.cbs.enums.AccountStatusE;
import org.cbs.enums.AccountTypeE;

import java.math.BigDecimal;

@Data
public class Account {

    private String accountNumber;
    private BigDecimal balance;
    private String accountTypeE;
    private String accountStatusE;

}
