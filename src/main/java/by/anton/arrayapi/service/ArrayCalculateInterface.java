package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;

public interface ArrayCalculateInterface {
    int sumElementsOfArray(CustomArray customArray)throws ApiException;
    int averageOfArray(CustomArray customArray)throws ApiException;
}
