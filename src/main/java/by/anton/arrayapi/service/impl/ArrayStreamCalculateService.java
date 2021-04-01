package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.ArrayCalculateInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayStreamCalculateService implements ArrayCalculateInterface {
    private final static Logger logger = LogManager.getLogger();

    public int sumElementsOfArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding sum of elements called from ArrayStreamCalculateService");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int sum= Arrays.stream(customArray.getArray())
                .sum();
        return sum;
    }

    public double averageOfArray(CustomArray customArray) throws ApiException {
        logger.info("Method for finding average of elements called from ArrayStreamCalculateService");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        double average= Arrays.stream(customArray.getArray())
                .average()
                .getAsDouble();
        return average;
    }
}
