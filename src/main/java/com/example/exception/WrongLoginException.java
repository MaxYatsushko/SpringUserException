package com.example.exception;

public class WrongLoginException extends UserException{

    public WrongLoginException(String message) {
        super(message, 888);
    }
}
