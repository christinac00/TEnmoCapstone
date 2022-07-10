package com.techelevator.tenmo.controller;

import com.techelevator.tenmo.dao.JdbcAccountDao;
import com.techelevator.tenmo.dao.JdbcTransferDao;
import com.techelevator.tenmo.dao.JdbcUserDao;
import com.techelevator.tenmo.exception.AccountNotFoundException;
import com.techelevator.tenmo.model.Account;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;


@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private JdbcAccountDao accountDao;
    private JdbcUserDao userDao;
    private JdbcTransferDao transferDao;

    public AccountController(JdbcAccountDao accountDao, JdbcUserDao userDao, JdbcTransferDao transferDao) {
        this.accountDao = accountDao;
        this.userDao = userDao;
        this.transferDao = transferDao;
    }

    @RequestMapping(path= "", method = RequestMethod.GET)
    public List<Account> listAccounts() {
        return accountDao.findAllAccountId();
    }


    @RequestMapping(path = "/balance/{id}", method = RequestMethod.GET)
    public BigDecimal findBalance(@PathVariable int id) throws AccountNotFoundException {
        return accountDao.findAcctIdByUserId(id).getBalance();
    }



}
