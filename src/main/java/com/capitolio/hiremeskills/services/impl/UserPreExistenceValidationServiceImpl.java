package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.exceptions.UserDoesNotExistException;
import com.capitolio.hiremeskills.loggers.UserPreExistenceValidationLogger;
import com.capitolio.hiremeskills.services.RetrievingUsersService;
import com.capitolio.hiremeskills.services.UserPreExistenceValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserPreExistenceValidationServiceImpl implements UserPreExistenceValidationService {

    private final RetrievingUsersService retrievingUsersService;

    @Override
    public void validatePreExistenceOf(Long userId) {
        UserPreExistenceValidationLogger.logStartingValidationOf(userId);
        if(this.retrievingUsersService.retrieveBy(userId).isEmpty())
            throw new UserDoesNotExistException(userId);
    }
}
