package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.services.commons.JustSavedAnnouncementService;
import org.springframework.stereotype.Service;

@Service
public interface UserSkillSetSavedAnnouncementService extends JustSavedAnnouncementService<UserSkillSetDto> {
}
