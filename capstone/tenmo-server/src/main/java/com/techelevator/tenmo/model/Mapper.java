package com.techelevator.tenmo.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class Mapper {

    public TransferDTO transferDTO(Transfer transfer){
        Integer fromUser = transfer.getAccountFrom();
        Integer toUser = transfer.getAccountTo();
        BigDecimal amount = transfer.getAmount();

        return new TransferDTO(fromUser, toUser, amount);

    }


}
