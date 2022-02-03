package com.capitolio.hiremeskills.loggers;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RoleSkillSetSavedAnnouncementLogger {

    public static void logStartingAnnouncementOfRoleSkillSetThatHasBeenSaved(RoleSkillSetDto roleSkillSet) {
        Logger.logInfo("Starting announcement of a role skill set that has been saved now: ".concat(roleSkillSet.toString()));
    }
}
