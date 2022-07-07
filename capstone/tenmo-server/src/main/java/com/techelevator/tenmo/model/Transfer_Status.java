package com.techelevator.tenmo.model;

public class Transfer_Status {

    public Transfer_Status(int transferStatusId, String transferStatus) {
        this.transferStatusId = transferStatusId;
        this.transferStatus = transferStatus;
    }

    public int getTransferStatusId() {
        return transferStatusId;
    }

    public void setTransferStatusId(int transferStatusId) {
        this.transferStatusId = transferStatusId;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    private int transferStatusId;
    private String transferStatus;
}
