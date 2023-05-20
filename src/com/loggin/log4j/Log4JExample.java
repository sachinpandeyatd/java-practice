package com.loggin.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JExample {
    private static final Logger logger = Logger.getLogger(Log4JExample.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        
        try {
			int a = 2/0;
		} catch (ArithmeticException e) {
	        logger.fatal(e);
		}
        
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
}
