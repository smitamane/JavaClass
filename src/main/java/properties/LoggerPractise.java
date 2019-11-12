package properties;

import org.apache.log4j.Logger;

public class LoggerPractise {
    public static void main(String []args)
    {
        Logger LOGGER= Logger.getLogger(LoggerPractise.class);
        LOGGER.trace("trace");
        LOGGER.debug("debug");
        LOGGER.warn("warn");
        LOGGER.debug("fatal");
        LOGGER.warn("error");


    }
}
