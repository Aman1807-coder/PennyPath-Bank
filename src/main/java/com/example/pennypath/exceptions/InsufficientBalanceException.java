package com.example.pennypath.exceptions;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(String error) {
        super(error);
    }
}
