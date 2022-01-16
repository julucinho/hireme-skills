package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.clients.RolesClient;
import com.capitolio.hiremeskills.dtos.RoleDto;
import com.capitolio.hiremeskills.exceptions.ProblemAtConsumingCompaniesServiceException;
import com.capitolio.hiremeskills.loggers.RetrievingRolesServiceLogger;
import com.capitolio.hiremeskills.services.RetrievingRolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetrievingRolesServiceImpl implements RetrievingRolesService {

    private final RolesClient rolesClient;

    @Override
    public Optional<RoleDto> retrieveBy(Long id) {
        var responseFromOuterService = this.rolesClient.retrieveById(id);
        if (responseFromOuterService.getStatusCode().is2xxSuccessful())
            return Optional.ofNullable(responseFromOuterService.getBody());
        if (responseFromOuterService.getStatusCode().value() == 404)
            return Optional.empty();
        RetrievingRolesServiceLogger.logProblemWhenTryingToRetrieveById(id, responseFromOuterService.toString());
        throw new ProblemAtConsumingCompaniesServiceException();
    }
}
