package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcAccountDao implements AccountDao {
    private Account account;
    private JdbcTemplate jdbcTemplate;

    public JdbcAccountDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Account> findAllAccountId() {
        List<Account> account = new ArrayList<Account>();
        String select = "SELECT account_id, user_id, balance FROM account;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(select);

        while (result.next()) {
            account.add(mapRowToAccount(result));
        }
        return account;
    }


//    @Override
//    public Account findAcctByAcctId(int acctId){
//        Account account = null;
//        String sql = "SELECT account_id, user_id, balance FROM account WHERE account_id = ?;";
//        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, acctId);
//        if (result.next()){
//            account = mapRowToAccount(result);
//        }
//        return account;
//    }

    @Override
    public Account findAcctIdByUserId(int userId) {
        Account account = null;
        String sql = "SELECT account_id, user_id, balance FROM account WHERE user_id = ?;";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, userId);
        if(rowSet.next()){
            account = mapRowToAccount(rowSet);
        }
        return account;
    }

    @Override
    public Account getBalance(int accountId) {
        Account account = null;
        String sql = "SELECT account_id, user_id, balance FROM account WHERE account_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, accountId);
        if (results.next()){
            account = mapRowToAccount(results);
        }
        return account;
    }
//    @Override
//    public Account findAcctByUsername(String username) {
//        Account account = null;
//        String sql = "SELECT account_id, balance, t.user_id, t.username " +
//                "FROM account a" + "JOIN tenmo_user t " + "ON a.user_id = t.user_id " +
//                "WHERE username = ?; ";
//        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, username);
//        if (result.next()) {
//            account = mapRowToAccount(result);
//        }
//        return account;
//    }




    private Account mapRowToAccount (SqlRowSet rowSet){
        Account account = new Account();
        account.setAccountId(rowSet.getInt("account_id"));
        account.setUserId(rowSet.getInt("user_id"));
        account.setBalance(rowSet.getBigDecimal("balance"));
        return account;
    }

}
