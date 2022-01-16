package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.RoleDto;
import com.capitolio.hiremeskills.services.commons.RetrievingByIdService;
import org.springframework.stereotype.Service;

@Service
public interface RetrievingRolesService extends RetrievingByIdService<RoleDto, Long> {
}
