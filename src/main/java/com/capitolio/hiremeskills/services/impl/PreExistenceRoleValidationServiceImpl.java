package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.exceptions.RoleDoestNotExistException;
import com.capitolio.hiremeskills.loggers.PreExistenceRoleValidationLogger;
import com.capitolio.hiremeskills.services.PreExistenceRoleValidationService;
import com.capitolio.hiremeskills.services.RetrievingRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PreExistenceRoleValidationServiceImpl implements PreExistenceRoleValidationService {

    private final RetrievingRolesService retrievingRolesService;

    @Override
    public void validatePreExistenceOf(Long roleId) {
        PreExistenceRoleValidationLogger.logStartingValidationOf(roleId);
        if (this.retrievingRolesService.retrieveBy(roleId).isEmpty())
            throw new RoleDoestNotExistException(roleId);
    }
}
