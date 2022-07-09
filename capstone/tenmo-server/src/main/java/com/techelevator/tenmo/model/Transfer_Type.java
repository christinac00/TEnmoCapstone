package com.techelevator.tenmo.model;

public class Transfer_Type {

    private int transferTypeId;
    private String transferType;

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



}
