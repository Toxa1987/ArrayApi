package by.anton.arrayapi.validate.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidate {
    private static final Logger logger = LogManager.getLogger();

    public boolean isValid(String str) {
        logger.info("Method validate of string called");
        String[] elements = str.split(", ");
        boolean isVal = true;
        for (String element : elements) {
            if (!element.matches("-?\\d+")) {
                isVal = false;
                break;
            }
        }
        return isVal;
    }
}
