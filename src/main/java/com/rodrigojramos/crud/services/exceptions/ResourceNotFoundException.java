package com.rodrigojramos.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
