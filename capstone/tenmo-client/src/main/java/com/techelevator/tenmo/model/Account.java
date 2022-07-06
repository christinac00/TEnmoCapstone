package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {

    private BigDecimal currentBalance;
    private int accountId;
    private int userId;

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = BigDecimal.valueOf(1000.00);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
