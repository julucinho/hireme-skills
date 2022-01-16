package com.capitolio.hiremeskills.loggers;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PreExistenceRoleValidationLogger {
    public static void logStartingValidationOf(Long roleId) {
        Logger.logInfo("Starting validation of role ID equal to ".concat(roleId.toString()));
    }
}
