package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.services.commons.RetrievingByIdService;
import org.springframework.stereotype.Service;

@Service
public interface RetrievingSkillSetsForUsersService extends RetrievingByIdService<UserSkillSetDto, Long> {
}
