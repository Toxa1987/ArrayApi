package by.anton.arrayapi.creator.impl;

import by.anton.arrayapi.creator.CreatorFactoryInterface;
import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateFactory implements CreatorFactoryInterface {
    Logger logger = LogManager.getLogger();

    public CustomArray createCustomArray(int[] someArray) throws ApiException {
        logger.info("Method to create custom array called");
        if (someArray == null) throw new ApiException("Array must be not Null");
        CustomArray customArray = new CustomArray();
        customArray.setArray(someArray);
        return customArray;
    }
}
