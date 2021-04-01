package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.exception.IncorrectConditionException;

public interface ArrayChangeInterface {
    void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ApiException, IncorrectConditionException;
}
