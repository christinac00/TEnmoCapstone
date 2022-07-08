package com.techelevator.tenmo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Insufficient balance.")
public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(){ super("Insufficient balance.");}
}
