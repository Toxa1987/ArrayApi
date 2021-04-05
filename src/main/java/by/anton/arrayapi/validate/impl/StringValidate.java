package by.anton.arrayapi.validate.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidate {
    private static final Logger logger = LogManager.getLogger();

    public boolean isValid(String str) {
        logger.info("Method validate of string called");
        if (str.length() == 0) {
            return false;
        }
        boolean isVal = false;
        if(str.matches("(-?\\d+[,]?\\s+?)*")){
        String[] elements = str.split(",\\s+");
        isVal=true;
        for (String element : elements) {
            if (!element.matches("-?\\d+")) {
                isVal = false;
                break;
            }
        }
        }
        return isVal;
    }
}
