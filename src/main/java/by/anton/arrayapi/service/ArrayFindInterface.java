package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;

public interface ArrayFindInterface {
    int arrayMin(CustomArray customArray) throws ApiException;
    int arrayMax(CustomArray customArray) throws ApiException;
    int negativeNumbersInArray(CustomArray customArray) throws ApiException;
    int positiveNumbersInArray(CustomArray customArray) throws ApiException;
}
