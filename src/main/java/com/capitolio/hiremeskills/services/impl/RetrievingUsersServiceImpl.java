package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.clients.UsersClient;
import com.capitolio.hiremeskills.dtos.UserDto;
import com.capitolio.hiremeskills.exceptions.NotFoundByIdException;
import com.capitolio.hiremeskills.loggers.RetrievingUsersLogger;
import com.capitolio.hiremeskills.services.RetrievingUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetrievingUsersServiceImpl implements RetrievingUsersService {

    private final UsersClient usersClient;

    @Override
    public Optional<UserDto> retrieveBy(Long id) {
        try {
            var user = this.usersClient.retrieveUserById(id);
            return Optional.of(user);
        } catch (NotFoundByIdException exception){
            RetrievingUsersLogger.userNotFoundById(id);
            return Optional.empty();
        }
    }
}
