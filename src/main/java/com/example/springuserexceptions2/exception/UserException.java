package com.example.springuserexceptions2.exception;

public class UserException extends RuntimeException {
    private final int errorCode;

    public UserException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}