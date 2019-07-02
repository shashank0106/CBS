package org.cbs.accounts.persistence.entity;

import org.cbs.enums.AccountStatusE;
import org.cbs.enums.AccountTypeE;
import org.cbs.enums.convertors.AccountStatusConvertor;
import org.cbs.enums.convertors.AccountTypeConvertor;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "account_details")
@Entity
public class Account {

    @Id
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name="balance")
    private BigDecimal balance;
    @Column(name="account_type")
    @Convert(converter = AccountTypeConvertor.class)
    private AccountTypeE accountType;
    @Column(name="status")
    @Convert(converter = AccountStatusConvertor.class)
    private AccountStatusE accountStatus;
    @Column(name="userid")
    private String userId;



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                ", accountStatus=" + accountStatus +
                ", userId='" + userId + '\'' +
                '}';
    }

    public AccountTypeE getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeE accountType) {
        this.accountType = accountType;
    }

    public AccountStatusE getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatusE accountStatus) {
        this.accountStatus = accountStatus;
    }
}
