package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.services.SavingSkillSetsForUsersService;
import com.capitolio.hiremeskills.services.UserPreExistenceValidationService;
import com.capitolio.hiremeskills.services.UserSkillSetSavedAnnouncementService;
import com.capitolio.hiremeskills.repositories.UserSkillSetsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavingSkillSetsForUsersServiceImpl implements SavingSkillSetsForUsersService {

    private final UserPreExistenceValidationService userPreExistenceValidationService;
    private final UserSkillSetsRepository userSkillSetsRepository;
    private final UserSkillSetSavedAnnouncementService userSkillSetSavedAnnouncementService;

    @Override
    public void saveNew(UserSkillSetDto userSkillSet) {
        this.userPreExistenceValidationService.validatePreExistenceOf(userSkillSet.getUserId());
        this.userSkillSetsRepository.save(userSkillSet);
        this.userSkillSetSavedAnnouncementService.announceNew(userSkillSet);
    }
}
