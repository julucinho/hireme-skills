package com.capitolio.hiremeskills.loggers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RetrievingUsersLogger {


    public static void userNotFoundById(Long id) {
        Logger.logInfo("User with ID ".concat(id.toString()).concat(" wasn't found."));
    }
}
