package com.capitolio.hiremeskills.services;

import org.springframework.stereotype.Service;

@Service
public interface PreExistenceRoleValidationService {
    void validatePreExistenceOf(Long roleId);
}
