package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.UserDto;
import com.capitolio.hiremeskills.services.commons.RetrievingByIdService;
import org.springframework.stereotype.Service;

@Service
public interface RetrievingUsersService extends RetrievingByIdService<UserDto, Long> {
}
