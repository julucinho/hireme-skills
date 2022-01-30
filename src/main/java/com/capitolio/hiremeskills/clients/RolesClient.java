package com.capitolio.hiremeskills.clients;

import com.capitolio.hiremeskills.dtos.RoleDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface RolesClient {

    Optional<RoleDto> retrieveRoleById(Long id);

}
