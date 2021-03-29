package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.ArrayCalculateInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateService implements ArrayCalculateInterface {
    private final static Logger logger = LogManager.getLogger();

    public int sumElementsOfArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding sum of elements called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i];
        }
        return sum;
    }

    public int averageOfArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding average of elements called");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        return sumElementsOfArray(customArray) / tempArray.length;
    }
}
