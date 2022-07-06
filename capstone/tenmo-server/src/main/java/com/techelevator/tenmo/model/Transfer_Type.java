package com.techelevator.tenmo.model;

public class Transfer_Type {

    public Transfer_Type(int transferTypeId, String transferType) {
        this.transferTypeId = transferTypeId;
        this.transferType = transferType;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    private int transferTypeId;
    private String transferType;

}
