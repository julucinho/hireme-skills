package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.clients.UsersClient;
import com.capitolio.hiremeskills.services.UserPreExistenceValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserPreExistenceValidationServiceImpl implements UserPreExistenceValidationService {

    private final UsersClient usersClient;

    @Override
    public void validatePreExistenceOf(Long instanceId) {
        var responseFromUsersService = this.usersClient.retrieveUserById(instanceId);
    }
}
