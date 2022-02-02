package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.clients.RolesClient;
import com.capitolio.hiremeskills.dtos.RoleDto;
import com.capitolio.hiremeskills.exceptions.NotFoundByIdException;
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
        try{
            var role = this.rolesClient.retrieveRoleById(id);
            return Optional.of(role);
        } catch (NotFoundByIdException exception){
            RetrievingRolesServiceLogger.roleIdNotFound(id);
            return Optional.empty();
        }
    }
}
