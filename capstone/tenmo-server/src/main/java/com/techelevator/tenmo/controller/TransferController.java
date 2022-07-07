package com.techelevator.tenmo.controller;


import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.model.Transfer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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



}
