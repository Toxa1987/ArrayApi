package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;

public interface ArraySortInterface {
    void bubbleSort(CustomArray customArray) throws ApiException;
    void quickSort(CustomArray customArray) throws ApiException;
    void shellSort(CustomArray customArray) throws ApiException;
}
