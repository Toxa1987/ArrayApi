package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.ArrayFindInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayStreamFindService implements ArrayFindInterface {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int arrayMin(CustomArray customArray) throws ApiException {
        logger.info("Method for minimum called from ArrayStreamFindService");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int min = Arrays.stream(customArray.getArray())
                .min()
                .getAsInt();
        return min;
    }

    @Override
    public int arrayMax(CustomArray customArray) throws ApiException {
        logger.info("Method for maximum called from ArrayStreamFindService");
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        int max = Arrays.stream(customArray.getArray())
                .max()
                .getAsInt();
        return max;
    }

    @Override
    public int negativeNumbersInArray(CustomArray customArray) throws ApiException {
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        logger.info("Method for finding negative numbers called from ArrayStreamFindService");
        int count = (int) Arrays.stream(customArray.getArray())
                .filter(element -> element < 0)
                .count();
        return count;
    }

    @Override
    public int positiveNumbersInArray(CustomArray customArray) throws ApiException {
        if (customArray.isEmpty()) {
            throw new ApiException("Array is null");
        }
        logger.info("Method for finding positive numbers called from ArrayStreamFindService");
        int count = (int) Arrays.stream(customArray.getArray())
                .filter(element -> element > 0)
                .count();
        return count;
    }
}
