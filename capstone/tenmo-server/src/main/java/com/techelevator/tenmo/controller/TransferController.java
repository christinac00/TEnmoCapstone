package com.techelevator.tenmo.controller;


import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.model.Transfer;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class TransferController {

    private JdbcTransferDao transferDao;


    public TransferController(JdbcTransferDao transferDao) {
        this.transferDao = transferDao;
    }

    @RequestMapping(path = "/userlist", method = RequestMethod.GET)
    public List<Transfer> listOfUsers(){
        return transferDao.listOfUsers();
    }
@RequestMapping(path = "/transfer", method = RequestMethod.POST)
    public void createTransfer(@RequestBody Transfer transfer, @PathVariable int account_to, int account_from, BigDecimal amount) {
        transferDao.create(transfer, account_to, account_from, amount);
}

}
