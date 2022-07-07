package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;

    @Component
    public class JdbcTransferDao implements TransferDao {
        private JdbcTemplate jdbcTemplate;

        public JdbcTransferDao(DataSource dataSource) {
            this.jdbcTemplate = new JdbcTemplate(dataSource);
        }
        // transfer details
        // list all transfers by transfer_id
        // create transfer boolean
        // optional accept transfer boolean
        // optional reject transfer boolean
        // A transfer includes the User IDs of the from and to users and the amount of TE Bucks.
        // optional pending

        private Transfer mapRowToTransfer(SqlRowSet rowSet) {
            Transfer transfer = new Transfer();

            transfer.setTransferId(rowSet.getInt("transfer_id"));
            transfer.setTransferTypeId(rowSet.getInt("transfer_type_id"));
            transfer.setTransferStatusId(rowSet.getInt("transfer_status_id"));
            transfer.setAccountFrom(rowSet.getInt("account_from"));
            transfer.setAccountTo(rowSet.getInt("account_to"));
            transfer.setAmount(rowSet.getBigDecimal("amount"));
            return transfer;
        }

    }
