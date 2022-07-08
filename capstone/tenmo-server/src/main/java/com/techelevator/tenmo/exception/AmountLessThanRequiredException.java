package com.techelevator.tenmo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Amount must be greater than 0.")
public class AmountLessThanRequiredException extends Exception{

    public AmountLessThanRequiredException(){super("Amount must be greater than 0.");}
}
