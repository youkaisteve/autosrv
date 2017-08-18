package com.sm.autosrv.common.log;

import org.apache.log4j.Logger;

public class CommonLog {
    private Logger logger;

    public static CommonLog getLogger(Class clazz) {
        return new CommonLog(clazz);
    }

    protected CommonLog(Class clazz) {
        logger = Logger.getLogger(clazz);
    }

    public void error(Object message) {
        logger.error(message);
    }

    public void warn(Object message) {
        logger.warn(message);
    }

    public void info(Object message) {
        logger.info(message);
    }

    public void fatal(Object message) {
        logger.fatal(message);
    }

    public void debug(Object message) {
        logger.debug(message);
    }
}
