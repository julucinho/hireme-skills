package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.loggers.RoleSkillSetSavedAnnouncementLogger;
import com.capitolio.hiremeskills.services.RoleSkillSetSavedAnnouncementService;
import org.springframework.stereotype.Service;

@Service
public class RoleSkillSetSavedAnnouncementServiceImpl implements RoleSkillSetSavedAnnouncementService {
    @Override
    public void announceNew(RoleSkillSetDto roleSkillSet) {
        RoleSkillSetSavedAnnouncementLogger.logStartingAnnouncementOfRoleSkillSetThatHasBeenSaved(roleSkillSet);
    }
}
