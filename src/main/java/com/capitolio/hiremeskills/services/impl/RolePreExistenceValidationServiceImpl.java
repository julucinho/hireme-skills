package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.clients.impl.TestClient;
import com.capitolio.hiremeskills.exceptions.RoleDoestNotExistException;
import com.capitolio.hiremeskills.loggers.PreExistenceRoleValidationLogger;
import com.capitolio.hiremeskills.services.RetrievingRolesService;
import com.capitolio.hiremeskills.services.RolePreExistenceValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolePreExistenceValidationServiceImpl implements RolePreExistenceValidationService {

    private final RetrievingRolesService retrievingRolesService;
    private final TestClient testClient;
    @Override
    public void validatePreExistenceOf(Long roleId) {
        PreExistenceRoleValidationLogger.logStartingValidationOf(roleId);
        var teste = this.testClient.teste(roleId);
        var testes = this.testClient.teste2();
        if (this.retrievingRolesService.retrieveBy(roleId).isEmpty())
            throw new RoleDoestNotExistException(roleId);
    }
}
