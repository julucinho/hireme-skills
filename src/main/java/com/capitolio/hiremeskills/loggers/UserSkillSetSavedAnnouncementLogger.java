package com.capitolio.hiremeskills.loggers;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserSkillSetSavedAnnouncementLogger {
    public static void logStartingAnnouncementOfUserSkillSetThatHasBeenSaved(UserSkillSetDto justSavedInstance) {
        Logger.logInfo("Starting announcement of a user skill set that has been saved now: ".concat(justSavedInstance.toString()));
    }
}
