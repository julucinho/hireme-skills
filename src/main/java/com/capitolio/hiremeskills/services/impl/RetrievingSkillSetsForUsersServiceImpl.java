package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.services.RetrievingSkillSetsForUsersService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RetrievingSkillSetsForUsersServiceImpl implements RetrievingSkillSetsForUsersService {
    @Override
    public Optional<UserSkillSetDto> retrieveBy(Long id) {
        return Optional.empty();
    }
}
