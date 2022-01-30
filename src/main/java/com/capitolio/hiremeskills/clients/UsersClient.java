package com.capitolio.hiremeskills.clients;

import com.capitolio.hiremeskills.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public interface UsersClient {

    UserDto retrieveUserById(Long id);

}
