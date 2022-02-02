package com.capitolio.hiremeskills.exceptions;

public class NotFoundByIdException extends RuntimeException {

    public NotFoundByIdException(String message){
        super(message);
    }

}
