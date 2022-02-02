package com.capitolio.hiremeskills.exceptions;

import com.capitolio.hiremeskills.exceptions.commons.InstanceDoesNotExistException;

public class UserDoesNotExistException extends InstanceDoesNotExistException {
    public UserDoesNotExistException(Long userId) {
        super("User with ID of ".concat(userId.toString()).concat(" does not exist"));
    }
}
