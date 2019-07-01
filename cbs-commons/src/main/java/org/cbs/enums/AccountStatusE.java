package org.cbs.enums;

public enum AccountStatusE {
    ACTIVE("ACTIVE"), DORMANT("DORMANT"), CLOSED("CLOSED");

    private String status;

    AccountStatusE(String status) {
        this.status = status;
    }
}
