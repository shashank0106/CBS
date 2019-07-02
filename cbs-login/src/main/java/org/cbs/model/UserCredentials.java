package org.cbs.model;

public class UserCredentials {

    String userId;
    String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
