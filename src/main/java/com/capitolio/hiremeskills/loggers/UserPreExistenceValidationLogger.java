package com.capitolio.hiremeskills.loggers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserPreExistenceValidationLogger {

    public static void logStartingValidationOf(Long userId) {
        Logger.logInfo("Starting validation of pre existence of user with ID equal to ".concat(userId.toString()));
    }
}
