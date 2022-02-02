package com.capitolio.hiremeskills.exceptions;

import com.capitolio.hiremeskills.exceptions.commons.InstanceDoesNotExistException;

public class UserSkillSetDoestNotExistException extends InstanceDoesNotExistException {
    public UserSkillSetDoestNotExistException(Long roleId) {
        super("There is not an instance of User Skill Set with User ID equal to ".concat(roleId.toString()));
    }
}
