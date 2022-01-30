package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.services.commons.PreExistenceValidationService;
import org.springframework.stereotype.Service;

@Service
public interface UserPreExistenceValidationService extends PreExistenceValidationService<Long> {
}
