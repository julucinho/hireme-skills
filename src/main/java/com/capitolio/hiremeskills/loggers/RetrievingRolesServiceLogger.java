package com.capitolio.hiremeskills.loggers;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RetrievingRolesServiceLogger {
    public static void logProblemWhenTryingToRetrieveById(Long id, String responseEntityToString) {
        Logger.logError("There was a problem when trying to retrieve a role by an ID equal to "
                .concat(id.toString())
                .concat(". Response entity: ")
                .concat(responseEntityToString)
        );
    }
}
