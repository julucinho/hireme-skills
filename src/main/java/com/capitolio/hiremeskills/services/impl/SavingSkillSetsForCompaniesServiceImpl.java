package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.repositories.RoleSkillSetsRepository;
import com.capitolio.hiremeskills.services.PreExistenceRoleValidationService;
import com.capitolio.hiremeskills.services.RoleSkillSetSavedAnnouncementService;
import com.capitolio.hiremeskills.services.SavingSkillSetsForCompaniesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavingSkillSetsForCompaniesServiceImpl implements SavingSkillSetsForCompaniesService {

    private final PreExistenceRoleValidationService preExistenceRoleValidationService;
    private final RoleSkillSetsRepository roleSkillSetsRepository;
    private final RoleSkillSetSavedAnnouncementService roleSkillSetSavedAnnouncementService;

    @Override
    public void save(RoleSkillSetDto roleSkillSet) {
        this.preExistenceRoleValidationService.validatePreExistenceOf(roleSkillSet.getRoleId());
        this.roleSkillSetsRepository.save(roleSkillSet);
        this.roleSkillSetSavedAnnouncementService.announceNew(roleSkillSet);
    }
}
