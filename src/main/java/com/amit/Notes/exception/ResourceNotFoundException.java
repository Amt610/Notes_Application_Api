package com.amit.Notes.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String massage){
        super(massage);
    }
}
