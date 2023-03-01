package com.example.springuserexceptions2.exception;

public class WrongPasswordException extends UserException{

    public WrongPasswordException(String message) {
        super(message, 999);
    }
}
