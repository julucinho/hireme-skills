package com.capitolio.hiremeskills.exceptions;

import com.capitolio.hiremeskills.exceptions.commons.InstanceDoesNotExistException;

public class RoleDoestNotExistException extends InstanceDoesNotExistException {
    public RoleDoestNotExistException(Long roleId) {
        super("There is not an instance of Role with ID equal to ".concat(roleId.toString()));
    }
}
