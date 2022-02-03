package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.loggers.RoleSkillSetSavedAnnouncementLogger;
import com.capitolio.hiremeskills.services.RoleSkillSetSavedAnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleSkillSetSavedAnnouncementServiceImpl implements RoleSkillSetSavedAnnouncementService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void announceNew(RoleSkillSetDto roleSkillSet) {
        RoleSkillSetSavedAnnouncementLogger.logStartingAnnouncementOfRoleSkillSetThatHasBeenSaved(roleSkillSet);
        this.kafkaTemplate.send("user-skillset-added", roleSkillSet.toString());
    }
}
