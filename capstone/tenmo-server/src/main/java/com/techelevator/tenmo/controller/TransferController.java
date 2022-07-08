package com.techelevator.tenmo.controller;


import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.TransferDTO;
import org.apache.catalina.mapper.Mapper;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class TransferController {

    private JdbcTransferDao transferDao;
    private Mapper mapper;


    public TransferController(JdbcTransferDao transferDao) {
        this.transferDao = transferDao;
      //  this.mapper = mapper;
    }

    @RequestMapping(path = "/userlist", method = RequestMethod.GET)
    public List<Transfer> listOfUsers(){
        return transferDao.listOfUsers();
    }

    @RequestMapping(path = "/transfer", method = RequestMethod.POST)
    public void createTransfer(@RequestBody TransferDTO transferDTO) {
        //fromusser != touser exceptionerror
        // amount > 0


        transferDao.create(transferDTO);
    }

}
