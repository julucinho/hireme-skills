package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import org.springframework.stereotype.Service;

@Service
public interface SavingSkillSetsForUsersService {
    void saveNew(UserSkillSetDto userSkillSet);
}
