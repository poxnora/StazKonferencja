package com.example.conferenceapp.exceptions;

public class UserServiceException extends Exception {



    public UserServiceException() {
        super();
    }

    public UserServiceException(final String message) {
        super(message);
    }
}