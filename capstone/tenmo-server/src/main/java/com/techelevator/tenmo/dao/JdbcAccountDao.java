package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JdbcAccountDao {
    private Account account;

    public JdbcAccountDao(Account account) {

        this.account = account;
    }

    public static List<Account> accounts = new ArrayList<>();


    public Account getAccount(int accountId) {
        for(Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }

        }
        return null;
    }
    public void  createAccount(Account account, int accountId) {
        accounts.add(account);
        account.setBalance(BigDecimal.valueOf(1000));
    }

}
