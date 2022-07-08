package com.techelevator.tenmo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "User cannot transfer to self.")
public class UserCannotSendToSelfException extends Exception{
    public UserCannotSendToSelfException(){super("User cannot transfer to self.");}


}
