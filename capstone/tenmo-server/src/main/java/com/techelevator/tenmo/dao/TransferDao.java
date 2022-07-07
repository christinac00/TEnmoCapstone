package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;

import java.util.List;

public interface TransferDao {

    List<Transfer> listOfUsers();

    Transfer create(Transfer transfer, int transferID);

   // Transfer update(Transfer transfer, int transferID);

    Transfer selectUserForTransfer(int id);





}
