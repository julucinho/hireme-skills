package com.capitolio.hiremeskills.loggers;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RetrievingRolesServiceLogger {
    public static void roleIdNotFound(Long id) {
        Logger.logError("Impossible to retrieve a role by an ID equal to "
                .concat(id.toString())
        );
    }
}
