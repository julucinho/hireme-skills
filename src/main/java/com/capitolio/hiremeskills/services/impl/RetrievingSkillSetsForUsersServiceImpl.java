package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.repositories.UserSkillSetsRepository;
import com.capitolio.hiremeskills.services.RetrievingSkillSetsForUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetrievingSkillSetsForUsersServiceImpl implements RetrievingSkillSetsForUsersService {

    private final UserSkillSetsRepository userSkillSetsRepository;

    @Override
    public Optional<UserSkillSetDto> retrieveBy(Long id) {
        return this.userSkillSetsRepository.findById(id);
    }
}
