package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

public interface AccountDao {

    List<AccountDao> findAllAccountId();

    Account findAcctIdByUserId(int userId);

    Account getBalance(int accountId);

}
