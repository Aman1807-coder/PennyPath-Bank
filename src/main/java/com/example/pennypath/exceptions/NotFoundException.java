package com.example.pennypath.exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String error) {
        super(error);
    }
}
