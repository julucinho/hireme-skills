package com.capitolio.hiremeskills.exceptions;

import com.capitolio.hiremeskills.exceptions.commons.InstanceDoesNotExistException;

public class RoleSkillSetDoestNotExistException extends InstanceDoesNotExistException {
    public RoleSkillSetDoestNotExistException(Long roleId) {
        super("There is not an instance of Role Skill Set with Role ID equal to ".concat(roleId.toString()));
    }
}
