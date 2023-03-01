package com.example.springuserexceptions2.exception;

public class WrongLoginException extends UserException{

    public WrongLoginException(String message) {
        super(message, 888);
    }
}
