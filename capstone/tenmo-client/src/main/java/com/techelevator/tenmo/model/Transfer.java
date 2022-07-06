package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {
    public Transfer(int transferId, int transfer_TypeId, int transfer_StatusId, int accountFrom, int accountTo, BigDecimal transferAmount) {
        this.transferId = transferId;
        this.transfer_TypeId = transfer_TypeId;
        this.transfer_StatusId = transfer_StatusId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.transferAmount = transferAmount;
    }

    private int transferId;
    private int transfer_TypeId;
    private int transfer_StatusId;
    private int accountFrom;
    private int accountTo;
    private BigDecimal transferAmount;

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public int getTransfer_TypeId() {
        return transfer_TypeId;
    }

    public void setTransfer_TypeId(int transfer_TypeId) {
        this.transfer_TypeId = transfer_TypeId;
    }

    public int getTransfer_StatusId() {
        return transfer_StatusId;
    }

    public void setTransfer_StatusId(int transfer_StatusId) {
        this.transfer_StatusId = transfer_StatusId;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }


}
