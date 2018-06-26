package com.portal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@SpringBootApplication
public class HiringPortal {
    private static Logger logger = LogManager.getLogger(HiringPortal.class);
    public static void main(String[] args) {
        logger.info("Starting HiringPortal application..");
        SpringApplication.run(HiringPortal.class, args);
    }
}