package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAllAccountId();

//    Account findAcctByAcctId(int acctId);

    Account findAcctIdByUserId(int userId);

    Account getBalance(int accountId);

//    Account findAcctByUsername(String username);

//    Account findUsernameByAcct(int accountId);

}
