package com.example.exception;

public class WrongPasswordException extends UserException{

    public WrongPasswordException(String message) {
        super(message, 999);
    }
}
