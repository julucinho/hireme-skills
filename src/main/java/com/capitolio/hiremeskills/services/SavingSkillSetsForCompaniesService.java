package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import org.springframework.stereotype.Service;

@Service
public interface SavingSkillSetsForCompaniesService {
    void save(RoleSkillSetDto roleSkillSet);
}
