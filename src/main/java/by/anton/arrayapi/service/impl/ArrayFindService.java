package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.ArrayFindInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFindService implements ArrayFindInterface {
    private final static Logger logger = LogManager.getLogger();

    public int arrayMin(CustomArray customArray) throws ApiException {
        logger.info("Method for minimum called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int min = tempArray[0];
        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] < min) {
                min = tempArray[i];
            }
        }
        return min;
    }

    public int arrayMax(CustomArray customArray) throws ApiException {
        logger.info("Method for maximum called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int max = tempArray[0];
        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] > max) {
                max = tempArray[i];
            }
        }
        return max;
    }

    public int negativeNumbersInArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding negative numbers called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public int positiveNumbersInArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding positive numbers called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
