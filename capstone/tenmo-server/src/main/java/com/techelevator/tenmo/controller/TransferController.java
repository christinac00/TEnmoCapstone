package com.techelevator.tenmo.controller;


import com.techelevator.tenmo.dao.JdbcAccountDao;
import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.dao.TransferDao;
import com.techelevator.tenmo.exception.AmountLessThanRequiredException;
import com.techelevator.tenmo.exception.InsufficientBalanceException;
import com.techelevator.tenmo.exception.UserCannotSendToSelfException;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.TransferDTO;
import org.apache.catalina.mapper.Mapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@PreAuthorize("isAuthenticated()")
public class TransferController {

    private JdbcTransferDao transferDao;
    private JdbcAccountDao accountDao;
    //private Account account;
    private Mapper mapper;


    public TransferController(JdbcTransferDao transferDao, JdbcAccountDao accountDao) {
        this.transferDao = transferDao;
        this.accountDao = accountDao;
      //  this.mapper = mapper;
    }

    @RequestMapping(path = "/userlist", method = RequestMethod.GET)
    public List<Transfer> listOfUsers(){
        return transferDao.listOfUsers();
    }

    @RequestMapping(path = "/transfer", method = RequestMethod.POST)
    public void createTransfer(@RequestBody TransferDTO transferDTO) throws UserCannotSendToSelfException, AmountLessThanRequiredException, InsufficientBalanceException {
        Account account = accountDao.findAcctIdByUserId(transferDTO.getFromUser());
        if (transferDTO.getFromUser() == transferDTO.getToUser()) {
            throw new UserCannotSendToSelfException();
        }

        if (transferDTO.getAmount().compareTo(BigDecimal.valueOf(0)) <= 0) {
            throw new AmountLessThanRequiredException();
        }

        if (account.getBalance().compareTo(transferDTO.getAmount()) < 0) {
            throw new InsufficientBalanceException();


        } else {

            transferDao.create(transferDTO);
        }
        @RequestMapping(path = "/transfer/{id}", method = RequestMethod.GET)
                public  Transfer getTransferByTransferId(@PathVariable int id) {
            return transferDao.getTransferById(id);
        }

    }
}
