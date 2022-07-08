package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class TransferDTO {

    private int fromUser;
    private int toUser;
    private BigDecimal amount;
    private final static String status = "Approved";

    public TransferDTO(int fromUser, int toUser, BigDecimal amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    public int getFromUser() {
        return fromUser;
    }

    public void setFromUser(int fromUser) {
        this.fromUser = fromUser;
    }

    public int getToUser() {
        return toUser;
    }

    public void setToUser(int toUser) {
        this.toUser = toUser;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
