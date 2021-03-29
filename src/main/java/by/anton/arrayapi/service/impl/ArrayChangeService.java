package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.exception.IncorrectConditionException;
import by.anton.arrayapi.service.ArrayChangeInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeService implements ArrayChangeInterface {
    private final static Logger logger = LogManager.getLogger();

    public void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ApiException, IncorrectConditionException {
        logger.info("Method for change number  with condition called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        switch (condition) {
            case ("<"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] < whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] > whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] == whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] >= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("<="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] <= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("!="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] != whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            default:
                logger.error("Incorrect condition");
                throw new IncorrectConditionException();
        }

    }
}
