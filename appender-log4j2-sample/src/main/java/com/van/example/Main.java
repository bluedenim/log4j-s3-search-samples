package com.van.example;

import com.van.logging.LoggingEventCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Example program to exercise the logger.  Together with the log4j.properties
 * in this project, this program will demonstrate logging batches into S3.
 * <br>
 * The program will basically loop for a period of time while logging messages in various
 * levels at small intervals to simulate typical logging patterns in a long-lived process.
 *
 * This class is designed to work with Log4j 2.x.
 *
 * @author vly
 */
public class Main {
    private static Logger logger =
        LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("Hello from Main!");
        Long started = System.currentTimeMillis();
        Long now = System.currentTimeMillis();

        // Loop for 15 secs
        while (now - started < TimeUnit.SECONDS.toMillis(15)) {
            logger.info("Another round through the loop!");
            logger.warn("This is a warning!");
            logger.error("And this is an error!!!");
            // Sleep for a few seconds before logging messages again so we don't produce too much data
            Thread.sleep(TimeUnit.SECONDS.toMillis(3));
            now = System.currentTimeMillis();
        }

        LoggingEventCache.shutDown();
    }
}
