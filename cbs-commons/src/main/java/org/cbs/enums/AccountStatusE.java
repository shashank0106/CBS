package org.cbs.enums;

public enum AccountStatusE {
    ACTIVE("A"), DORMANT("D"), CLOSED("C");

    private String status;

    AccountStatusE(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
