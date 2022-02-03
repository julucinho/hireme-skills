package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.loggers.UserSkillSetSavedAnnouncementLogger;
import com.capitolio.hiremeskills.services.UserSkillSetSavedAnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSkillSetSavedAnnouncementServiceImpl implements UserSkillSetSavedAnnouncementService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void announceNew(UserSkillSetDto justSavedInstance) {
        UserSkillSetSavedAnnouncementLogger.logStartingAnnouncementOfUserSkillSetThatHasBeenSaved(justSavedInstance);
        this.kafkaTemplate.send("user-skillset-added", justSavedInstance.toString());
    }
}
