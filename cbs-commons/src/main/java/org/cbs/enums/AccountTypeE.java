package org.cbs.enums;

public enum AccountTypeE {
    SAVINGS("S"), CURRENT("C"), LOAN("L"), TERM_DEPOSIT("T");

    private String accountType;

    AccountTypeE(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
