package com.capitolio.hiremeskills.clients;

import com.capitolio.hiremeskills.dtos.RoleDto;
import com.capitolio.hiremeskills.exceptions.NotFoundByIdException;
import org.springframework.stereotype.Component;

@Component
public interface RolesClient {

    RoleDto retrieveRoleById(Long id) throws NotFoundByIdException;

}
