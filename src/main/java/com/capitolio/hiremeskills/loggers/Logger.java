package com.capitolio.hiremeskills.loggers;

import com.capitolio.hiremeskills.utils.ThreadIdRetrievementUtil;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class Logger {

    public static void logInfo(String message){
        log.info(message.concat(getSuffix()));
    }

    public static void logError(String message){
        log.error(message.concat(getSuffix()));
    }

    private static String getSuffix(){
        return " | ".concat(ThreadIdRetrievementUtil.retrieveThreadId());
    }

}
