package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.exception.IncorrectConditionException;
import by.anton.arrayapi.service.ArrayChangeInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayStreamChangeService implements ArrayChangeInterface {
    private final static Logger logger = LogManager.getLogger();
    private String[] arrayOfCondition = new String[]{">", "<", "=", "!=", "<=", ">="};

    @Override
    public void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ApiException, IncorrectConditionException {
        logger.info("Method for change number  with condition called from ArrayStreamChangeService");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        boolean isCorrectCondition = Arrays.stream(arrayOfCondition)
                .noneMatch(x -> x == condition);
        if (isCorrectCondition) {
            throw new IncorrectConditionException();
        }
        int[] tempArray = customArray.getArray();
        int[] newArray = Arrays.stream(tempArray)
                .map(x -> {
                    switch (condition) {
                        case ("<"):
                            if (x < whatChange) {
                                x = ch;
                            }
                            break;
                        case (">"):
                            if (x > whatChange) {
                                x = ch;
                            }
                            break;
                        case ("="):
                            if (x == whatChange) {
                                x = ch;
                            }
                            break;
                        case (">="):
                            if (x >= whatChange) {
                                x = ch;
                            }
                            break;
                        case ("<="):
                            if (x <= whatChange) {
                                x = ch;
                            }
                            break;
                        case ("!="):
                            if (x != whatChange) {
                                x = ch;
                            }
                            break;
                    }
                    return x;
                })
                .toArray();

        customArray.setArray(newArray);
    }
}
